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
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList> inventory;

    public StorageFacility() {
        this.inventory = new HashMap<>();
    }

    public void add(String unit, String item) {

        this.inventory.putIfAbsent(unit, new ArrayList<>());
        this.inventory.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        return this.inventory.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {

        this.inventory.get(storageUnit).remove(item);

    }

    public ArrayList<String> storageUnits() {

        ArrayList<String> nonEmpty = new ArrayList<>();

        for (String key : this.inventory.keySet()) {
            if (!(this.inventory.get(key).isEmpty())) {
                nonEmpty.add(key);
            }
        }

        return nonEmpty;
    }

}
