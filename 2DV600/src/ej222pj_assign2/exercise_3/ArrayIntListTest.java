/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_3
 * 
 * @file_name ArrayIntListTest.java
 */
package ej222pj_assign2.exercise_3;

import static org.junit.Assert.*;
import ej222pj_assign2.exercise_1.ArrayIntList;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * @author Eric
 *
 * @date 19 sep 2016 : @time 15:02:32
 *
 */

public class ArrayIntListTest {
	@Rule public TestName name = new TestName();
	ArrayIntList testList;
	
	@Before
	public void setUp(){
		System.out.println("Started test   :  " + name.getMethodName());
		testList = build(10);
	}
	
	@After
	public void tearDown(){
		System.out.println("Done with test :  " + name.getMethodName());
	}
	
	@Test
	public void testGetAtIndexOne() {
		int recievedNumberAtIndexOne = testList.get(1);
		assertEquals(1, recievedNumberAtIndexOne);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testGetAtOutOfBounds() {
		testList.get(11);
	}
	
	@Test
	public void testAddFiveToList() {
		int listSize = 5;
		ArrayIntList list = build(listSize);
		assertEquals(listSize, list.size());
	}
	
	@Test
	public void testAddThreeHundredToList() {
		int listSize = 300;
		ArrayIntList list = build(listSize);
		assertEquals(listSize, list.size());
	}

	@Test
	public void testAddAtIndexOne() {
		int numberToAddAtIndexOne = 10;
		testList.addAt(numberToAddAtIndexOne, 1);
		int addedNumberAtIndexOne = testList.get(1);
		assertEquals(numberToAddAtIndexOne, addedNumberAtIndexOne);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testAddAtOutOfBounds() {
		int OutOfBoundsIndex = 11;
		testList.addAt(1, OutOfBoundsIndex);
	}

	@Test
	public void testRemoveAtIndexOne() {
		int currentNumberAtIndexOne = testList.get(1);
		testList.remove(1);
		int numberAfterRemoveAtIndexOne = testList.get(1);
		assertNotSame(currentNumberAtIndexOne, numberAfterRemoveAtIndexOne);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testRemoveAtOutOfBounds() {
		testList.remove(11);
	}

	@Test
	public void testIndexOfOne() {
		int indexOfOne = testList.indexOf(1);
		assertEquals(1, indexOfOne);
	}
	
	@Test
	public void testIndexOfOutOfBounds() {
		int indexOfEleven = testList.indexOf(11);
		assertEquals(-1, indexOfEleven);
	}
	
	public ArrayIntList build(int size) {
		ArrayIntList list = new ArrayIntList();
		
		for(int i = 0; i < size; i++) {
			list.add(i);
		}
		
		return list;
	}

}
