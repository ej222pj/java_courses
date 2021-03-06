/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name CountDigits.java
 */
package ej222pj_assign1;

/**
 * @author Eric
 *
 * @date 30 aug 2016 : @time 12:55:50
 *
 */
import java.util.Scanner;

public class Backwards {
	public static void main(String args[]){
		Scanner ScannerInput;
		String exit = "exit";
		
		System.out.println("Exit the program by typing: " + exit);
		
		while(true){
			//Open a scanner to scan for an input
			ScannerInput = new Scanner(System.in);
			
			System.out.print("Type a line of text: ");
			
			//Save the line to reverse
			String LineToReverse = ScannerInput.nextLine();
			
			//Stop the program if the user type exit
			if(LineToReverse.equals(exit)){
				break;
			}
			//Reverse the inputed line
			String ReversedLine = new StringBuilder(LineToReverse).reverse().toString();
			
			//Print the reversed line
			System.out.println("Backwards: " + ReversedLine);
			
			
		}
		//Close scanner
		ScannerInput.close();
		System.out.print("Exiting!");
	}
}
