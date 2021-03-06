/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_5
 * 
 * @file_name Word.java
 */
package ej222pj_assign2.exercise_5;

/**
 * @author Eric
 *
 * @date 20 sep 2016 : @time 22:38:16
 *
 */
public class Word implements Comparable<Word> {
	private String word;

	public Word(String str) { 
		word = str; 
	}
	
	public String toString() { 
		return word; 
	}
	
	/* Override Object methods */
	@Override
	public int hashCode() { 
		//compute a hash value for word
		/*int hc = 0;
		for (int i=0; i < word.length(); i++) {
			char c = word.charAt(i);
			hc += Character.getNumericValue(c); // ASCII number
		}
		return hc;*/
		
		return word.toLowerCase().hashCode();
	}
	
	@Override
	public boolean equals(Object other) { 
		//true if two words are equal
		if (other instanceof Word) {
			Word otherWord = (Word) other;
			return word.toLowerCase().equals(otherWord.toString().toLowerCase()); // Compare ID strings
		}
		return false;
	}
	
	/* Implement Comparable */
	@Override
	public int compareTo(Word w) { 
		//compares two words lexicographically
		return word.compareToIgnoreCase(w.toString()); 
	}
}