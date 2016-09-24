/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_5
 * 
 * @file_name WordSet.java
 */
package ej222pj_assign2.exercise_5;

/**
 * @author Eric
 *
 * @date 23 sep 2016 : @time 00:42:19
 *
 */
public interface WordSet extends Iterable {
	public void add(Word word); // Add word if not already added
	public boolean contains(Word word); // Return true if word contained
	public int size(); // Return current set size
	public String toString(); // Print contained words
}