/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
public class Container {

    private int liquiAmount;

    public Container() {
        this.liquiAmount = 0;
    }

    public int contains() {
        return liquiAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        liquiAmount = liquiAmount + amount > 100 ? 100 : liquiAmount + amount;
    }

    public void move(int amount, Container container) {
        if (amount < 0) {
            return;
        }
        int finalAmountToMove = liquiAmount < amount ? liquiAmount : amount;
        remove(finalAmountToMove);
        container.add(finalAmountToMove);
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        liquiAmount = liquiAmount - amount < 0 ? 0 : liquiAmount - amount;
    }

    @Override
    public String toString() {
        return liquiAmount + "/100";
    }

}
