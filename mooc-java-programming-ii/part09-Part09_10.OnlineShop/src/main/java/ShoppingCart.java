/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);

        if (!this.cart.contains(item)) {
            this.cart.add(item);
            return;
        }
        item = this.cart.get(this.cart.indexOf(item));
        item.increaseQuantity();
    }

    public int price() {
        int total = 0;
        for (Item item : this.cart) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : this.cart) {
            System.out.println(item);
        }
    }

}
