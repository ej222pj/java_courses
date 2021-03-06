/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_5
 * 
 * @file_name IdentyfyWordsMain.java
 */
package ej222pj_assign2.exercise_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Eric
 *
 * @date 20 sep 2016 : @time 14:52:24
 *
 */
public class IdentyfyWordsMain {

	public static void main(String[] args) {
		if(args[0] != null) {
			try(BufferedReader bufferedReader  = new BufferedReader(new FileReader(args[0].toString()))) {    
		        File newFileWithOnlyWords = new File("word.txt");
		        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFileWithOnlyWords));
		        String line;
		        
		        while ((line = bufferedReader.readLine()) != null) {
		        	//Remove all numbers and letters if it's are the same word. And remove everything that is NOT a letter
		            String lineByLine = line.replaceAll("\\d+[a-zA-Z]|[^a-zA-z ]+", "");
		            bufferedWriter.write(lineByLine);
		            bufferedWriter.newLine();
		        }
		        
		        bufferedWriter.close();
		        bufferedReader.close();
			}     
			catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } 
			catch (IOException e) {
	            e.printStackTrace();
	        }
		}
		else {
			throw new IllegalArgumentException("Can't find any search path");
		}
	}
}
