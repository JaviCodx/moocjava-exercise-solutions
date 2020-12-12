/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
public class Main {
    
    public static void main(String[] args) {

    Agent bond = new Agent("James", "Bond");

    bond.toString(); // prints nothing

    System.out.println (bond);

    Agent ionic = new Agent("Ionic", "Bond");

    System.out.println (ionic);

}
}
