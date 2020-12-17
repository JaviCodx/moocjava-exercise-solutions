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

public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();

    }

    public void add(Packable item) {
        if (capacity - (item.weight() + this.weight()) >= 0) {

            this.items.add(item);

        }
    }

    public double weight() {
        double weigth = 0;
        for (Packable item : this.items) {
            weigth += item.weight();

        }
        return weigth;

    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

}
