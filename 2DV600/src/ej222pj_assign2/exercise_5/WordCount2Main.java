/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_5
 * 
 * @file_name WordCount2Main.java
 */
package ej222pj_assign2.exercise_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Eric
 *
 * @date 23 sep 2016 : @time 11:26:13
 *
 */
public class WordCount2Main {
	public static void main(String[] args) {
		HashWordSet hashWordSet = new HashWordSet();
		TreeWordSet treeWordSet = new TreeWordSet();
		if(args[0] != null) {
			try {
				Scanner scanner = new Scanner(new File(args[0]));
				//Reads every word
				while(scanner.hasNext()){
					Word word = new Word(scanner.next());
					hashWordSet.add(word);
					treeWordSet.add(word);
				}
				scanner.close();
			}
			catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } 
				
			System.out.println("HashWordset:");
			System.out.println(hashWordSet.toString());
			
			System.out.println("\nTreeWordset:");
			System.out.println(treeWordSet.toString());
			
			System.out.println("Hashset Size:" +hashWordSet.size());
			System.out.println("Treeset Size:" +treeWordSet.size());	
		}
		else {
			throw new IllegalArgumentException("Can't find any search path!");
		}
	}
}