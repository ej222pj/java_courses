package ej222pj_assign1;

import java.util.Scanner;

public class LargestK {
	public static void main(String args[]){
		//Open a scanner to scan for an input
		Scanner scannerInput = new Scanner(System.in);
		//Save the line to reverse
		int N = Integer.parseInt(scannerInput.nextLine());
		//Close the scanner
		scannerInput.close();
		int sum = 0;
		
		//Need to use (N+2) because if N=3 the loop wont run enough iterations.
		for(int i = 0; i < (N+2) ; i+=2){
            sum += i;
            
            if(sum == N)
            {
            	System.out.println("K = " + i);
            	break;
            }
            else if(sum > N)
            {
            	System.out.println("K = " + (i - 2));
            	break;
            }
            
       }
	}
}
