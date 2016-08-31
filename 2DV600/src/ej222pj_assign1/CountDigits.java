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
		String exit = "exit";
		System.out.println("Exit the program by typing: " + exit);
		
		while(true){
			System.out.print("Provide a positive integer: ");
			//Open a scanner to scan for an input
			ScannerInput = new Scanner(System.in);
			int zeros = 0;
			int odd = 0;
			int even = 0;
			int sum = 0;
			
			//Save input as string
			String StringCount = ScannerInput.nextLine();
			//Stop the program if the user type exit
			if(StringCount.equals(exit)){
				break;
			}
			
			//Split the array on every number
			String[] SplittedArray = StringCount.split("");
			
			//Loop the array to find zero, odd, even and sum
			for (String didgit  : SplittedArray) {
				int parsedInt = 0;
				//Try to parse the input
				try{
					//If the parse fail or the number is negative, quit the program.
					parsedInt = Integer.parseInt(didgit);
				    if(parsedInt < 0)
						break;
				} catch (NumberFormatException e) {
				    break;
				}
				//Add Sum
				sum = sum + parsedInt;
				
				//If the sum is 0, the integer does not start on a number greater then 0.
				if(sum != 0){
					//If the number is 0
					if(parsedInt == 0){
						zeros++;
					}
					//If the number is even
					else if((parsedInt % 2) == 0){
						even++;
					}
					//If the number is odd
					else{
						odd++;
					}
				}
			}
			System.out.println("Zeros: " + zeros + "\nOdd: " + odd + "\nEven: " + even + "\nSum: " + sum);			
		}
		//Close the scanner
		ScannerInput.close();
		System.out.print("Exiting!");
		
	}
}
