/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name HighLow.java
 */
package ej222pj_assign1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric
 *
 * @date 31 aug. 2016 : @time 14:42:24
 *
 */
public class HighLow {
	public static void main(String[] args) {
		Scanner ScannerInput;
		Random random = new Random();
		int max = 100;
		int min = 1;
		
		System.out.println("Guess a number between 1 and 100!");
		
		int randomNumber = random.nextInt(max - min + 1) + min;
		
		//Loop the guesses 10 times
		for(int i = 1; i < 11; i++){
			System.out.print("Guess " + i + ": ");
			
			ScannerInput = new Scanner(System.in);
			//Save input as string
			String guessedNumberString = ScannerInput.nextLine();
			int guessedNumber = 0;
			
			//Try to parse the input
			try{
				//If the parse fail or the number is negative, quit the program.
				guessedNumber = Integer.parseInt(guessedNumberString);
			    if(guessedNumber < 0)
					break;
			} catch (NumberFormatException e) {
			    break;
			}
			
			if(guessedNumber < randomNumber){
				System.out.println("Hint: higher");
			}
			else if(guessedNumber > randomNumber){
				System.out.println("Hint: lower");			
			}
			else{
				if(i < 4){
					System.out.println("Correct after only " + i + " guesses - Brilliant!");
					break;
				}
				else if(i > 3){
					System.out.println("Correct after " + i + " guesses!");
					break;
				}
			}
			if(i == 10){
				System.out.println("You have guessed 10 times. YOU LOST!");
			}
		}
		System.out.print("Exiting!");
	}
}
