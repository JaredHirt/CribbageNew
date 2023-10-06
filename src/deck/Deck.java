package deck;

import java.util.Arrays;
import java.util.Collections;

public class Deck {
    Card[] deck;
    public Deck(){
        deck = new Card[52];
        for(int i = 0; i < 52; i++)
            deck[0] = new Card(i);
    }

    public void shuffleDeck(){
        Collections.shuffle(Arrays.asList(deck));
    }
}
