/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.Iterator;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {

        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        hand.stream()
                .sorted()
                .forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(hand);

    }

    public int getHandValue() {
        return hand.stream().mapToInt(Card::getValue).sum();

    }

    @Override
    public int compareTo(Hand arg0) {

        return this.getHandValue() - arg0.getHandValue();

    }

    public void sortBySuit() {
        BySuitInValueOrder sort = new BySuitInValueOrder();
        Collections.sort(hand, sort);
        hand.stream()
                .forEach(n->System.out.print(n));
    }

}
