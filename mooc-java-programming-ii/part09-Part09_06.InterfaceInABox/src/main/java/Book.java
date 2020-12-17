/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
public class Book implements Packable {

    private String author, name;
    private double bookWeight;

    public Book(String author, String name, double bookWeight) {
        this.author = author;
        this.name = name;
        this.bookWeight = bookWeight;
    }

    public double weight() {
        return this.bookWeight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.name;

    }
}
