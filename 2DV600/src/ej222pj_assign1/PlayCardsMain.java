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
        Deck d = new Deck();
        d.shuffle();
        for(int i = 0; i < 12; i++)
        {
            System.out.println("Dealing card...");
            Card c = d.handsOutNextCard();
            System.out.println(Card.Value.valueOf(c.getCardValue()) + " of " + Card.Suit.valueOf(c.getSuitValue()));
            System.out.println("Cards left: " + d.deckSize());
        }

    }
}