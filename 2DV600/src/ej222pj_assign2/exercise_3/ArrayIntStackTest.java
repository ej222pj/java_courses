/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_3
 * 
 * @file_name ArrayIntStackTest.java
 */

package ej222pj_assign2.exercise_3;

import static org.junit.Assert.*;
import ej222pj_assign2.exercise_1.ArrayIntStack;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * @author Eric
 *
 * @date 19 sep 2016 : @time 13:50:50
 *
 */

public class ArrayIntStackTest {
	@Rule public TestName name = new TestName();
	
	@Before
	public void setUp(){
		System.out.println("Started test   :  " + name.getMethodName());
	}
	
	@After
	public void tearDown(){
		System.out.println("Done with test :  " + name.getMethodName());
	}
	
	@Test
	public void testPeekOnLast() {
		int numberOfInts = 5;
		ArrayIntStack list = build(numberOfInts);
		int topOfStack = list.peek();
		assertEquals(numberOfInts - 1, topOfStack);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testPeekOnEmptyStack() {
		ArrayIntStack list = new ArrayIntStack();
		list.peek();
	}
	
	@Test
	public void testPushFiveToTop() {
		ArrayIntStack list = new ArrayIntStack();
		list.push(10);
		list.push(5);
		int topOfStack = list.peek();
		assertEquals(5, topOfStack);
	}
	
	@Test
	public void testPushFifthyThousandInts() {
		int numberOfInts = 50000;
		ArrayIntStack list = build(numberOfInts);
		
		assertEquals(numberOfInts, list.size());
	}

	@Test
	public void testPopReturnedNumber() {
		int numberOfInts = 5;
		ArrayIntStack list = build(numberOfInts);
		
		int poppedNumber = list.pop();
		
		assertEquals(numberOfInts - 1, poppedNumber);
	}
	
	@Test
	public void testPopSizeAfter() {
		int numberOfInts = 5;
		ArrayIntStack list = build(numberOfInts);
		
		list.pop();
		
		assertEquals(numberOfInts - 1, list.size());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testPopOnEmptyStack() {
		ArrayIntStack list = new ArrayIntStack();
		
		list.pop();
	}
	

	public ArrayIntStack build(int size) {
		ArrayIntStack list = new ArrayIntStack();
		
		for(int i = 0; i < size; i++) {
			list.push(i);
		}
		
		return list;
	}
}
