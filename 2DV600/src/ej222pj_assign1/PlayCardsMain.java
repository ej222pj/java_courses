/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name PlayCardsMain.java
 */
package ej222pj_assign1;

/**
 * @author Eric
 *
 * @date 7 sep 2016 : @time 21:48:21
 *
 */
public class PlayCardsMain {

    public static void main(String args[])
    {
        Deck deck = new Deck();
        deck.shuffle();
        for(int i = 0; i < 10; i++)
        {
            Card card = deck.handOutNextCard();
            if(card == null){
            	break;
            }
            System.out.println("Card: " + Card.Value.valueOf(card.getCardValue()) + " of " + Card.Suit.valueOf(card.getSuitValue()));
            System.out.println("Cards in deck: " + deck.deckSize());
        }
        System.out.println("Done!");
    }
}