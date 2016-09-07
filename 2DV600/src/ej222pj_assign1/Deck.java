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

    public Deck()
    {
        for(int k = 1; k <= 4; k++)
        {
            for (int i = 1; i <= 13; i++)
            {
                deck.add(new Card(k, i));
            }
        }
    }

    public List<Card> getDeck()
    {
        return deck;
    }

    public void shuffle()
    {
        if(Deck.deck.size() < 52)
        {
            System.out.println("No");
            System.exit(0);
        }
        Collections.shuffle(Deck.deck);
    }

    public Card handsOutNextCard()
    {
        Card selectedCard = deck.get(0);
        deck.remove(0);
        return selectedCard;
    }

    public int deckSize()
    {
        return deck.size();
    }
}