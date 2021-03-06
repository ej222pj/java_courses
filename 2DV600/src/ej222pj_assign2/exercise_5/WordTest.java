/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_5
 * 
 * @file_name WordTest.java
 */
package ej222pj_assign2.exercise_5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Eric
 *
 * @date 20 sep 2016 : @time 23:31:23
 *
 */
public class WordTest {	
	private String testWordHello = "hello";
	Word newWord;
	
	@Before
	public void setUp(){
		newWord = new Word(testWordHello);
	}
	
	/**
	 * Get back word, test method for {@link ej222pj_assign2.exercise_5.Word#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals(testWordHello, newWord.toString());
	}

	/**
	 * Create word, test method for {@link ej222pj_assign2.exercise_5.Word#Word(java.lang.String)}.
	 * May be redundant, same as above
	 */
	@Test
	public void testWord() {		
		assertEquals(testWordHello, newWord.toString());
	}

	/**
	 * Is correct hash with same word, test method for {@link ej222pj_assign2.exercise_5.Word#hashCode()}.
	 */
	@Test
	public void testHashCodeIsCorrect() {
		Word otherWord = new Word(testWordHello);
		int correctHashCode = otherWord.hashCode();
		int hashCodeFromMethod = newWord.hashCode();
		
		assertEquals(correctHashCode, hashCodeFromMethod);
	}
	
	/**
	 * Is correct hash with capital letters, test method for {@link ej222pj_assign2.exercise_5.Word#hashCode()}.
	 */
	@Test
	public void testHashCodeIsCorrectWithCapital() {
		Word otherWord = new Word("HeLlO");
		int correctHashCode = otherWord.hashCode();
		int hashCodeFromMethod = newWord.hashCode();
		
		assertEquals(correctHashCode, hashCodeFromMethod);
	}
	
	/**
	 * Is wrong word, test method for {@link ej222pj_assign2.exercise_5.Word#hashCode()}.
	 */
	@Test
	public void testHashCodeNotSameWord() {
		Word otherWord = new Word("helloo");
		int correctHashCode = otherWord.hashCode();
		int hashCodeFromMethod = newWord.hashCode();
		
		//If hashcode - hashcode is 0 the word is the same
		assertFalse((correctHashCode - hashCodeFromMethod) == 0);
	}

	/**
	 * Equals same word, test method for {@link ej222pj_assign2.exercise_5.Word#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsWithSameWord() {
		Word otherWord = new Word(testWordHello);
		
		assertTrue(newWord.equals(otherWord));
	}
	
	/**
	 * Equals same word with capitals, test method for {@link ej222pj_assign2.exercise_5.Word#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsWithSameWordCapital() {
		Word otherWord = new Word("HelLo");
		
		assertTrue(newWord.equals(otherWord));
	}
	
	/**
	 * Equals not same word, test method for {@link ej222pj_assign2.exercise_5.Word#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsWithNotSameWord() {
		Word otherWord = new Word("helloo");
		
		assertFalse(newWord.equals(otherWord));
	}

	/**
	 * Same word, test method for {@link ej222pj_assign2.exercise_5.Word#compareTo(ej222pj_assign2.exercise_5.Word)}.
	 */
	@Test
	public void testCompareToSameWords() {
		Word other = new Word(testWordHello);

		assertEquals(0, newWord.compareTo(other));
	}	

	/**
	 * Same word with capital, test method for {@link ej222pj_assign2.exercise_5.Word#compareTo(ej222pj_assign2.exercise_5.Word)}.
	 */
	@Test
	public void testCompareToWithSameWordCapital() {
		Word other = new Word("HelLO");
		
	    assertEquals(0, newWord.compareTo(other));
	}

	/**
	 * Word before Lex Order, test method for {@link ej222pj_assign2.exercise_5.Word#compareTo(ej222pj_assign2.exercise_5.Word)}.
	 */
	@Test
	public void testCompareToWordBeforeInLexicographicalOrder() {
		Word other = new Word("greetings");

		assertTrue(newWord.compareTo(other) > 0);
	}

	/**
	 * Word after Lex Order, test method for {@link ej222pj_assign2.exercise_5.Word#compareTo(ej222pj_assign2.exercise_5.Word)}.
	 */
	@Test
	public void testCompareToWordAfterInLexicographicalOrder() {
		Word other = new Word("welcome");

		assertTrue(newWord.compareTo(other) < 0);
	}
	
	/**
	 * Word with almost same Lex Order, test method for {@link ej222pj_assign2.exercise_5.Word#compareTo(ej222pj_assign2.exercise_5.Word)}.
	 */
	@Test
	public void testCompareToWordAlmostSameInLexicographicalOrder() {
		//hallo is before hello in Lexicographical Order
		Word other = new Word("hallo");

		assertTrue(newWord.compareTo(other) > 0);
	}
}
