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

    public enum Suit{
        Clubs(1), 
        Spades(2), 
        Diamonds(3), 
        Hearts(4) ;

        private int suitValue;

        private static Map<Integer, Suit> map = new HashMap<Integer, Suit>();

        static{
            for(Suit suitVal : Suit.values()){
                map.put(suitVal.suitValue, suitVal);
            }
        }

        private Suit(final int suitValue){
        	this.suitValue = suitValue;
        }

        public static Suit valueOf(int value){
            return map.get(value);
        }
    };

    public enum Value{
        Ace(1), 
        Two(2), 
        Three(3), 
        Four(4), 
        Five(5), 
        Six(6), 
        Seven(7), 
        Eight(8), 
        Nine(9), 
        Ten(10), 
        Jack(11), 
        Queen(12), 
        King(13);

        private int cardValue;

        private static Map<Integer, Value> valueMap = new HashMap<Integer, Value>();

        static {
            for(Value value : Value.values()){
            	valueMap.put(value.cardValue, value);
            }
        }

        private Value(final int val){
        	cardValue = val;
        }

        public static Value valueOf(int value){
            return valueMap.get(value);
        }
    };

    public Card(int suitValue, int cardValue){
        this.suitValue = suitValue;
        this.cardValue = cardValue;
    }
    
    public int getSuitValue(){
        return this.suitValue;
    }

    public int getCardValue(){
        return this.cardValue;
    }
}