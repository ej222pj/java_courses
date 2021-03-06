/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2
 * 
 * @file_name ArrayIntStack.java
 */
package ej222pj_assign2.exercise_1;

import da1031.AbstractIntCollection;
import da1031.IntStack;

/**
 * @author Eric
 *
 * @date 12 sep 2016 : @time 16:36:16
 *
 */
public class ArrayIntStack extends AbstractIntCollection implements IntStack {
	
	/* Add integer at top of stack. */
	@Override
	public void push(int n) {
		values[size++] = n;
		if(size == values.length) resize();
	}

	/* Returns and removes integer at top of stack  */
	@Override
	public int pop() throws IndexOutOfBoundsException {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Empty Stack");
		}
		else {
			int n = values[size - 1];
			values[size - 1] = 0;
			size--;
			
			return n;
		}
	}

	/* Returns without removing integer at top of stack */
	@Override
	public int peek() throws IndexOutOfBoundsException {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Empty Stack");
		}
		else {
			return values[size -1];
		}
	}
}
