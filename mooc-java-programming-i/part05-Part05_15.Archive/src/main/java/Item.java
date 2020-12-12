/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
public class Item {

    private String name, id;

    public Item(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        return this.id.equals(comparedItem.id);

    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }

}
