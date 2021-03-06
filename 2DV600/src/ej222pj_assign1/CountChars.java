/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name CountChars.java
 */
package ej222pj_assign1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Eric
 *
 * @date 1 sep 2016 : @time 16:05:57
 *
 */
public class CountChars {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int upperCase = 0;
		int lowerCase = 0;
		int whitespace = 0;
		int numbers = 0;
		int otherChar = 0; 
		String line;
		String allLines = "";
		
        try(BufferedReader br = new BufferedReader(new FileReader(args[0].toString()))) {
            
            while ((line = br.readLine()) != null) {
            	allLines += line;
            }
            
            char[] chars = allLines.toCharArray();
                for (int i = 0; i < chars.length; i++) {
		            // Check for uppercase letters.
		    	    if (Character.isUpperCase(chars[i])){ 
		    	    	upperCase++;
		    	    }
		    	    // Check for lowercase letters.
		    	    else if (Character.isLowerCase(chars[i])){
		    	    	lowerCase++;
		    	    }
		    	    // Check for whitespaces.
		    	    else if (Character.isWhitespace(chars[i])){
		    	    	whitespace++;
		    	    }
		    	    // Check for digits.
		    	    else if (Character.isDigit(chars[i])){
		    	    	numbers++;
		    	    }
		    	    // Check for other chars.
		    	    else{
		    	    	otherChar++;
		    	    }
		    	}
        }
        System.out.println("Upper case letters: " + upperCase);
        System.out.println("Lower case letters: " + lowerCase);
        System.out.println("Whitespace " + whitespace);
        System.out.println("Other characters: " + otherChar);
        System.out.println("Numbers: " + numbers);
    }
}