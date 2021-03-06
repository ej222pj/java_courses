/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name Deck.java
 */
package ej222pj_assign1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Eric
 *
 * @date 7 sep 2016 : @time 21:45:03
 *
 */
public class Deck {
	
    private static List<Card> deck = new ArrayList<Card>(52);

    public Deck() {
    	deck.clear();
        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= 13; j++){
                deck.add(new Card(i, j));
            }
        }
    }

    public List<Card> getDeck(){
        return deck;
    }

    public void shuffle(){
        if(deckSize() == 52){
        	Collections.shuffle(Deck.deck);
        }
        else {
        	System.out.println("Can't shuffle!");
            System.exit(0);
        }
    }

    public Card handOutNextCard(){
    	if(deck.isEmpty()){
    		return null;
    	}
        Card selectedCard = deck.get(0);
        deck.remove(0);
        return selectedCard;
    }

    public int deckSize(){
        return deck.size();
    }
}