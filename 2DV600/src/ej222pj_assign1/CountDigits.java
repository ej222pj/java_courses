/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name CountDigits.java
 */
package ej222pj_assign1;

import java.util.Scanner;

/**
 * @author Eric
 *
 * @date 30 aug 2016 : @time 15:02:08
 *
 */
public class CountDigits {
	public static void main(String[] args) {
		Scanner ScannerInput;
		int zeros = 0;
		int odd = 0;
		int even = 0;
		int sum = 0;
		
		while(true){
			System.out.print("Provide a positive integer: ");
			//Open a scanner to scan for an input
			ScannerInput = new Scanner(System.in);
			
			//Save input as string
			String StringN = ScannerInput.nextLine();
			int DigitCounter = 0;
			
			//Try to parse the input
			try{
				//If the parse fail or the number is negative, quit the program.
				DigitCounter = Integer.parseInt(StringN);
			    if(DigitCounter < 0)
					break;
			} catch (NumberFormatException e) {
			    break;
			}
			
			//Close the scanner
		}	ScannerInput.close();
	}
}