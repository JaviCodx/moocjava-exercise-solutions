/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.ArrayList;

public class Suitcase {

    private int maxweight;
    private ArrayList<Item> items;
    private int totalWeight;

    public Suitcase(int maxweight) {

        this.maxweight = maxweight;
        this.items = new ArrayList<>();
        this.totalWeight = 0;

    }

    public void addItem(Item item) {

        if (this.totalWeight + item.getWeight() <= this.maxweight) {
            this.items.add(item);
            this.totalWeight += item.getWeight();

        }

    }

    @Override
    public String toString() {

        if (this.items.isEmpty()) {
            return "no items " + "(" + this.totalWeight + "kg)";
        }

        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight + "kg)";
        }

        return this.items.size() + " items (" + this.totalWeight + "kg)";
    }

    public void printItems() {

        String returned = "";

        for (Item item : this.items) {
            returned = returned + item + "\n";
        }

        System.out.print(returned);
    }

    public int totalWeight() {
        return totalWeight;
    }

    public Item heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item item : this.items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;

            }
        }

        return heaviestItem;

    }

}
