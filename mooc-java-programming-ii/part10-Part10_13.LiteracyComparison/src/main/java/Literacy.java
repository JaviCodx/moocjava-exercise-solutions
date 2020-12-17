/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
public class Literacy implements Comparable<Literacy> {

    private String country, gender;
    private double literacyPercentage;
    private int year;

    public Literacy(String gender, String country, int year, double literacyPercentage) {
        this.country = country;
        this.literacyPercentage = literacyPercentage;
        this.year = year;
        this.gender = gender.replaceAll("[()%]", "").trim();

    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyPercentage;
    }

    @Override
    public int compareTo(Literacy arg0) {
        if (this.literacyPercentage == arg0.literacyPercentage) {
            return 0;
        } else if (this.literacyPercentage > arg0.literacyPercentage) {
            return 1;

        } else {
            return -1;
        }

    }

}
