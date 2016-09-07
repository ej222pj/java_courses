/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name Card.java
 */
package ej222pj_assign1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eric
 *
 * @date 7 sep 2016 : @time 21:44:47
 *
 */
public class Card {

    private int cardValue;
    private int suitValue;

    public enum Suit
    {
        Clubs(1), Diamonds(2), Hearts(3), Spades(4);

        private int sValue;

        private static Map<Integer, Suit> map = new HashMap<Integer, Suit>();

        static
        {
            for(Suit sVal : Suit.values())
            {
                map.put(sVal.sValue, sVal);
            }
        }

        private Suit(final int val)
        {
            sValue = val;
        }

        public static Suit valueOf(int value)
        {
            return map.get(value);
        }
    };

    public enum Value
    {
        Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13);

        private int value;

        private static Map<Integer, Value> map = new HashMap<Integer, Value>();

        static
        {
            for(Value val : Value.values())
            {
                map.put(val.value, val);
            }
        }

        private Value(final int val)
        {
            value = val;
        }

        public static Value valueOf(int value)
        {
            return map.get(value);
        }
    };

    public Card(int suitValue, int cardValue)
    {
        this.suitValue = suitValue;
        this.cardValue = cardValue;
    }

    public int getSuitValue()
    {
        return this.suitValue;
    }

    public int getCardValue()
    {
        return this.cardValue;
    }
}