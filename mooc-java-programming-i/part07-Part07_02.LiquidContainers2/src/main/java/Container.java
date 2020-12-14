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

    private int contains;
    private final int max, min;

    public Container() {
        this.contains = 0;
        this.max = 100;
        this.min = 0;

    }

    public void add(int amount) {
        if (amount > 0) {
            contains += amount;
            if (contains > max) {
                contains = max;
            }
        }

    }

    public void remove(int amount) {
        if (amount > 0) {
            contains -= amount;
            if (contains < min) {
                contains = min;
            }

        }

    }

    public int contains() {
        return this.contains;
    }

    public void setContains(int contains) {
        this.contains = contains;
    }
    
    

    @Override
    public String toString() {
        return this.contains + "/" + max;
    }

}
