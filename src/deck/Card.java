package deck;

/**
 * This file is part of a solution to cribbage in java
 */

public class Card {
    private final Rank rank;
    private final Suit suit;

    /**
     * Initializes deck.Card
     * @param r rank
     * @param s suit
     */
    public Card(Rank r, Suit s){
        rank = r;
        suit = s;
    }

    /**
     * Initializes a card based on an integer
     * @param n integer representing the card you want
     */
    public Card(int n){
        rank = Rank.values()[n%13];
        suit = Suit.values()[n/13];
    }
}
