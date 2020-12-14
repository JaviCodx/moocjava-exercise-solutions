/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
public class Bird {

    private String name, latinName;
    private int obervations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.obervations = 0;

    }

    public String getName() {
        return name;
    }

    public int getObervations() {
        return obervations;
    }

    public String getLatinName() {
        return latinName;
    }

    public void addObervation(String bird) {
        if (this.name.equals(bird)) {
            this.obervations++;
            return;
        }

        System.out.println("Not a bird!");
    }

}
