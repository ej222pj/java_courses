/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_5
 * 
 * @file_name WordCount1Main.java
 */
package ej222pj_assign2.exercise_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Eric
 *
 * @date 22 sep 2016 : @time 23:00:27
 *
 */
public class WordCount1Main {
	public static void main(String[] args) {
		HashSet<Word> hashSet = new HashSet<>();
		TreeSet<Word> treeSet = new TreeSet<>();
		if(args[0] != null) {
			try {
				Scanner scanner = new Scanner(new File(args[0]));
				//Reads every word
				while(scanner.hasNext()) {
					Word word = new Word(scanner.next());
					hashSet.add(word);
					treeSet.add(word);
				}
				scanner.close();
			}
			catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } 
			
			//Print every word in alphabetical order
			Iterator<Word> treeIterator = treeSet.iterator();
			while(treeIterator.hasNext()) {
				System.out.println(treeIterator.next());
			}
			
			System.out.println("\nHashSet: " + hashSet.size());
			System.out.println("Treeset: " + treeSet.size());
			System.out.println("Would be 350 but i remove the S after 1960s, etc...");
		}
		else {
				throw new IllegalArgumentException("Can't find any search path");
		}
	}
}