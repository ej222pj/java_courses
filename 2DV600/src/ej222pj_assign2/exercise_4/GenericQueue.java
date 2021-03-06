/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_4
 * 
 * @file_name GenericQueue.java
 */
package ej222pj_assign2.exercise_4;

import java.util.Iterator;

/**
 * @author Eric
 *
 * @date 19 sep 2016 : @time 18:39:38
 *
 */
public class GenericQueue<E> implements Queue<E> {
	private Node head = null;
    private Node tail = null;
    private int size = 0;

    // current queue size 
    @Override
    public int size() {
        return size;
    }

    // true if queue is empty
    @Override
    public boolean isEmpty() {
        return size == 0 && head == null && tail == null;
    }

    // add element at end of queue
    @Override
    public void enqueue(E element) {
        if (head == null){
            head = new Node(element);
            tail = head;
        }else{
            tail.next = new Node(element);
            tail = tail.next;
        }
        size++;
    }

    // return and remove first element.
    @Override
    public E dequeue() throws IndexOutOfBoundsException {
        if (isEmpty()){
        	throw new IndexOutOfBoundsException("Can't dequeue, queue is empty!");
        }else{
        	E value = head.value;
        	head = head.next;
        	Node node = head;
        	
        	for(int i = 1; i <= size; i++) {
        		if(node != null) node = node.next;
        	}
            size--;
            return value;
        }
    }

    // return (without removing) first element
    @Override
    public E first() throws IndexOutOfBoundsException {
        if (isEmpty()){
        	 throw new IndexOutOfBoundsException("Can't get first, queue is empty!");
        }else{
        	return head.value;
        }
    }

    // return (without removing) last element
    @Override
    public E last() throws IndexOutOfBoundsException {
        if (isEmpty()){
        	throw new IndexOutOfBoundsException("Can't get last, queue is empty!");
        }else{
            return tail.value;
        }
    }

    // element iterator
    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<E>{
        private Node node = head;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public E next() {
        	if (hasNext()) {
        		E val = node.value;
            	node = node.next;
            	return val;
        	}
        	else {
        		throw new IndexOutOfBoundsException("No next element");
        	}
        }
    }

    private class Node  {
        E value;
        Node next = null;

        public Node(E v){
            value = v;
        }
    }
}