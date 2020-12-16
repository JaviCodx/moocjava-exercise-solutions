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

public class BoxWithMaxWeight extends Box {

    private int maxCapacity, current;
    private final ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {

        this.maxCapacity = capacity;
        this.items = new ArrayList<>();
        this.current = 0;

    }

    @Override
    public void add(Item item) {

        if (maxCapacity >= this.current + item.getWeight()) {
            this.current += item.getWeight();
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.stream().anyMatch(isItem -> isItem.equals(item));
    }

}
