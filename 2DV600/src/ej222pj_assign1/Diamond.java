/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name Diamond.java
 */
package ej222pj_assign1;

import java.util.Scanner;

/**
 * @author Eric
 *
 * @date 1 sep 2016 : @time 15:33:08
 *
 */
public class Diamond {
	public static void main(String[] args) {
		System.out.print("Provide an odd integer: ");
		Scanner ScannerInput = new Scanner(System.in);
		//Save input as string
		String guessedNumberString = ScannerInput.nextLine();
		int guessedNumber = 0;
		
		//Try to parse the input
		try{
			//If the parse fail or the number is negative, quit the program.
			guessedNumber = Integer.parseInt(guessedNumberString);
		    if(guessedNumber < 0 || (guessedNumber % 2) == 0){
		    	System.out.print("Number is not odd! Exiting!");
		    	System.exit(0);
		    }
		} catch (NumberFormatException e) {
			System.err.print("Can not parse! Exiting!");
			System.exit(0);
		}
		//Close the scanner
		ScannerInput.close();
		
		int n = guessedNumber;
		for(int i = 1; i <= n; i += 2){
			for(int k = 0; k < (n - i); k += 2){
				System.out.print(" ");
			}
			
			for(int j = 0; j < ((i * 2) - 1); j += 2){
				System.out.print("*");
			}
			
			System.out.println("");
		}
		for(int i = 1; i <= n; i += 2){
			for(int k = 0; k < i; k += 2){
				System.out.print(" ");
			}
			
			for(int j = 2; j <= (n - i); j++){
				System.out.print("*");
		    }
			
			System.out.println("");
		}
	}
}