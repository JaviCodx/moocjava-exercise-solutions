/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card firstCard, Card secondCard) {
        if (firstCard.getSuit() == secondCard.getSuit()) {
            return firstCard.getValue() - secondCard.getValue();
        }

        return firstCard.getSuit().compareTo(secondCard.getSuit());
    }
}
