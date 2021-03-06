/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_4
 * 
 * @file_name GenericQueueTest.java
 */
package ej222pj_assign2.exercise_4;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

/**
 * @author Eric
 *
 * @date 19 sep 2016 : @time 19:16:29
 *
 */
public class GenericQueueTest {

	/**
	 * Enqueue a lot of nodes, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#enqueue(java.lang.Object)}.
	 */
	@Test
	public void testEnqueueTwoHundredThousandNodes() {
		int numberOfNodes = 200000;
	    Queue<Integer> queue = build(numberOfNodes);
	    
	    assertEquals(numberOfNodes, queue.size());
	}
	
	/**
	 * Enqueue small number of nodes, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#enqueue(java.lang.Object)}.
	 */
	@Test
	public void testEnqueueFiveNodes() {
		int numberOfNodes = 5;
	    Queue<Integer> queue = build(numberOfNodes);
	    
	    assertEquals(numberOfNodes, queue.size());
	}
	
	/**
	 * Big size test method for {@link ej222pj_assign2.exercise_4.GenericQueue#size()}.
	 */
	@Test
	public void testSizeWithFiftyThousandNodes() {
		int numberOfNodes = 50000;
	    Queue<Integer> queue = build(numberOfNodes);

	    assertEquals(numberOfNodes, queue.size());
	}
	
	/**
	 * Empty test method for {@link ej222pj_assign2.exercise_4.GenericQueue#size()}.
	 */
	@Test
	public void testSizeWithEmptyQueue() {
	    Queue<Integer> queue = new GenericQueue<>();

	    assertEquals(0, queue.size());
	}


	/**
	 * Empty test method for {@link ej222pj_assign2.exercise_4.GenericQueue#isEmpty()}.
	 */
	@Test
	public void testIsEmptyOnEmptyQueue() {
		 Queue<Integer> queue = new GenericQueue<>();

	    assertTrue(queue.isEmpty());
	}
	
	/**
	 * Not empty test method for {@link ej222pj_assign2.exercise_4.GenericQueue#isEmpty()}.
	 */
	@Test
	public void testIsEmptyOnNotEmptyQueue() {
		 Queue<Integer> queue = build(1);

	    assertFalse(queue.isEmpty());
	}

	/**
	 * Dequeue with ten nodes to get value, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#dequeue()}.
	 */
	@Test
	public void testDequeueValueWithTenNodesToGetValue() {
	    int numberOfNodes = 10;
	    Queue<Integer> queue = build(numberOfNodes);
	    
	    int dequeuedNodeValue = queue.dequeue();
	    
	    assertEquals(1, dequeuedNodeValue);
	}
	
	/**
	 * Dequeue with ten nodes to get size, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#dequeue()}.
	 */
	@Test
	public void testDequeueValueWithTenNodesToGetSize() {
	    int numberOfNodes = 10;
	    Queue<Integer> queue = build(numberOfNodes);
	    
	    queue.dequeue();
	    
	    assertEquals(numberOfNodes - 1, queue.size());
	}
	
	/**
	 * Dequeue with empty queue, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#dequeue()}.
	 */
	@Test(expected=IndexOutOfBoundsException.class)
	public void testDequeueWithEmptyQueue() {
	    Queue<Integer> queue = new GenericQueue<>();
	    
	    queue.dequeue();
	}

	/**
	 * Value of first node, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#first()}.
	 */
	@Test
	public void testFirstValueInQueue() {
		int numberOfNodes = 10;
	    Queue<Integer> queue = build(numberOfNodes);
	    
	    int firstNodeValue = queue.first();
	    
	    assertEquals(1, firstNodeValue);
	}
	
	/**
	 * Value of first node on empty queue, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#first()}.
	 */
	@Test(expected=IndexOutOfBoundsException.class)
	public void testFirstValueOfEmptyQueue() {
	    Queue<Integer> queue = new GenericQueue<>();
	    
	    queue.first();
	}
	
	/**
	 * Value of last node, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#last()}.
	 */
	@Test
	public void testLastValueOfQueue() {
		int numberOfNodes = 10;
	    Queue<Integer> queue = build(numberOfNodes);
	    
	    int lastNodeValue = queue.last();
	    
	    assertEquals(numberOfNodes, lastNodeValue);
	}
	
	/**
	 * Value of last node on empty queue, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#last()}.
	 */
	@Test(expected=IndexOutOfBoundsException.class)
	public void testLastValueOfEmptyQueue() {
	    Queue<Integer> queue = new GenericQueue<>();
	    
	    queue.last();
	}
	
	/**
	 * Value of first and last is same, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#first()}/{@link ej222pj_assign2.exercise_4.GenericQueue#last()}.
	 */
	@Test
	public void testFirstLastIsSameValue() {
		Queue<Integer> queue = new GenericQueue<>();
		
		queue.enqueue(1);

	    int firstLast[] = {queue.first(), queue.last()};

	    assertEquals(firstLast[0], firstLast[1]);
	}

	/**
	 * Queue is iterator, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#iterator()}.
	 */
	@Test
	public void testQueueIsIterator() {
		Queue<Integer> queue = build(5);
		
		boolean isQueueInstanceOfIterator = queue.iterator() instanceof Iterator;
		
		assertTrue(isQueueInstanceOfIterator);
	}
	
	/**
	 * Has next with elements, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#iterator()}.
	 */
	@Test
	public void testIteratorHasNextWithElementsInQueue() {
		Queue<Integer> queue = build(5);
		
		assertTrue(queue.iterator().hasNext());
	}
	
	/**
	 * Has next with empty queue, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#iterator()}.
	 */
	@Test
	public void testIteratorHasNextWithEmptyQueue() {
		Queue<Integer> queue = new GenericQueue<>();
		
		assertFalse(queue.iterator().hasNext());
	}
	
	/**
	 * Next value in the queue, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#iterator()}.
	 */
	@Test
	public void testIteratorNextValueInQueue() {
		Queue<Integer> queue = build(5);
		//Start at 0, next should be 1
		int nextValue = queue.iterator().next();
		
		assertEquals(1, nextValue);
	}
	
	/**
	 * Next value in empty queue, test method for {@link ej222pj_assign2.exercise_4.GenericQueue#iterator()}.
	 */
	@Test(expected=IndexOutOfBoundsException.class)
	public void testIteratorNextValueInEmptyQueue() {
		Queue<Integer> queue = new GenericQueue<>();
		
		queue.iterator().next();
	}
	
	private Queue<Integer> build(int size) {
	    Queue<Integer> queue = new GenericQueue<>();

	    for (int i = 1; i <= size; i++) {
	      queue.enqueue(i);
	    }

	    return queue;
	  }
}