package ej222pj_assign1;

import java.util.Scanner;

public class Backwards {
	public static void main(String args[]){
		System.out.print("Type a line of text: ");
		
		//Open a scanner to scan for an input
		Scanner scannerInput = new Scanner(System.in);
		//Save the line to reverse
		String LineToReverse = scannerInput.nextLine();
		//Close the scanner
		scannerInput.close();
		//Reverse the inputed line
		StringBuilder ReversedLine = new StringBuilder(LineToReverse).reverse();
		//Print the reversed line
		System.out.print("Backwards: " + ReversedLine);
	}
}
