/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> registryPrice, registryStock;

    public Warehouse() {
        this.registryPrice = new HashMap<>();
        this.registryStock = new HashMap<>();

    }

    public void addProduct(String product, int price, int stock) {

        this.registryPrice.put(product, price);
        this.registryStock.put(product, stock);
    }

    public int price(String product) {
        if (this.registryPrice.containsKey(product)) {
            return this.registryPrice.get(product);
        }
        return -99;

    }

    public int stock(String product) {
        if (this.registryStock.containsKey(product)) {
            return this.registryStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (!this.registryStock.containsKey(product)) {
            return false;
        }

        this.registryStock.put(product, (this.stock(product) - 1));
        if (this.registryStock.get(product) < 0) {
            this.registryStock.put(product, 0);
            return false;
        }

        return true;
    }

    public Set<String> products() {
        return this.registryPrice.keySet();

    }

}
