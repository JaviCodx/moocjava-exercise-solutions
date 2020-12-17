/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
public class CD implements Packable {

    private final double cdWeight = 0.1;

    private String artist, name;
    private int year;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }

    public double weight() {
        return this.cdWeight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.year + ")";//To change body of generated methods, choose Tools | Templates.
    }

}
