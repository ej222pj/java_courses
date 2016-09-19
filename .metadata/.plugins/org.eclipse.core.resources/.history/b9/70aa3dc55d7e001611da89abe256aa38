/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2
 * 
 * @file_name ArrayIntList.java
 */
package ej222pj_assign2.exercise_1;

import da1031.AbstractIntCollection;
import da1031.IntList;

/**
 * @author Eric
 *
 * @date 12 sep 2016 : @time 16:35:35
 *
 */
public class ArrayIntList extends AbstractIntCollection implements IntList {

	/* Add integer n to the end of the list. */
	@Override
	public void add(int n) {
		if (size == values.length) resize();
	
		values[size++] = n;
	}

	/* Inserts integer n at position index. Shifts the element currently at that 
	 * position (if any) and any subsequent elements to the right.  */
	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		if (!checkIndex(index, size + 1)) throw new IndexOutOfBoundsException();
		
		if (size == values.length) resize();
		
		for (int i = size; i > index; i--) {
			values[i] = values[i - 1];
		}
		values[index] = n;
		size++;
	}
	
	/* Remove integer at position index. */
	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		if (isEmpty() || !checkIndex(index, size)) throw new IndexOutOfBoundsException();
	
		for (int i = index; i < size; i++) {
			values[i] = values[i + 1];
		}
		size--;
	}
	
	/* Get integer at position index. */
	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		if (isEmpty() || !checkIndex(index, size)) throw new IndexOutOfBoundsException();
		
		return values[index];
	}
	
	/* Find position of integer n, otherwise return -1 */
	@Override
	public int indexOf(int n) {
		for(int i = 0; i < values.length; i++) {
			if (values[i] == n) return i;
		}
		
	return -1;
	}
}