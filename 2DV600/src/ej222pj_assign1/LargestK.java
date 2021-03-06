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
 * @date 30 aug 2016 : @time 14:05:25
 *
 */
import java.util.Scanner;

public class LargestK {
	public static void main(String args[]){
		Scanner ScannerInput;
		
		System.out.println("Find Largest K with increment of 2! \nType any non positive integer to quit!");
	
		while(true){
			System.out.print("Enter a positive integer to find Largest K: ");
			
			//Open a scanner to scan for an input
			ScannerInput = new Scanner(System.in);
			
			//Save input as string
			String StringN = ScannerInput.nextLine();
			int N = 0;
			
			//Try to parse the input
			try{
				//If the parse fail or the number is negative, quit the program.
			    N = Integer.parseInt(StringN);
			    if(N < 0)
					break;
			} catch (NumberFormatException e) {
			    break;
			}
			
			int sum = 0;
			int K = 0;
			
			//Add values as long as sum + (K+2) is less or equal to N
			while(sum + (K + 2) <= N){
				K += 2;
				
				sum += K;
			}
			System.out.println("K = " + K);
		}
		//Close the scanner
		ScannerInput.close();
		System.out.print("Exiting!");
	}
}
