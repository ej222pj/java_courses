/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name Play123Main.java
 */
package ej222pj_assign1;

import java.text.DecimalFormat;

/**
 * @author Eric
 *
 * @date 8 sep 2016 : @time 14:01:43
 *
 */
public class Play123Main {

	public static void main(String[] args) {
		int wins = 0;
		int numberOfRounds = 10000;
		
		for(int i = 0; i < numberOfRounds; i++){
			Deck deck = new Deck();
		    deck.shuffle(); 
			if(play123(deck)) wins++;
		}
	
		System.out.println("You won: " + wins + " Times");
		System.out.println("You lost: " + (numberOfRounds - wins) + " Times");
		System.out.println("Chance To Win This Time Was: " + 
		new DecimalFormat("#.##").format(((double)wins / (double)numberOfRounds) * 100) + "%");
	}
	
	static boolean play123(Deck deck) {
		int counter = 1; 
		int numberOfCards = deck.deckSize();
		for(int i = 0; i < numberOfCards; i++){
			if(counter > 3){
				counter = 1;
			}
			Card card = deck.handOutNextCard();
			
			if(card.getCardValue() == counter) return false;
			counter++;
		}	
		return true;
	}
}