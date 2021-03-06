/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name Queue.java
 */
package ej222pj_assign1;

import java.util.Iterator;

/**
 * @author Eric
 *
 * @date 9 sep 2016 : @time 17:26:20
 *
 */
public class Queue implements QueueInterface {
	private Node head = null;
    private Node tail = null;
    private int size = 0;
    
    private class ListIterator implements Iterator<Object>{
        private Node node = head;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Object next() {
            Object val = node.value;
            node = node.next;
            return val;
        }
    }

    private class Node  {
        Object value;
        Node next = null;

        public Node(Object v){
            value = v;
        }
    }

    // current queue size 
    @Override
    public int size() {
        return size;
    }

    // true if queue is empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // add element at end of queue
    @Override
    public void enqueue(Object element) {
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
    public Object dequeue() throws IndexOutOfBoundsException {
        Node dequeueNode;
        if (size == 0 && head == null){
        	throw new IndexOutOfBoundsException("Error: list is empty!");
        }else{
        	if (head.next == null){
            	dequeueNode = head;
                head = null;
                tail = null;
            }else{
            	dequeueNode = head;
                head = head.next;
                Node before = head;
                for (int i = 0; i < size; i++){
                    if (before != null){
                        before = before.next;
                    }
                }
            }
            size--;
            return dequeueNode.value;
        }
    }

    // return (without removing) first element
    @Override
    public Object first() throws IndexOutOfBoundsException {
        if (size == 0 || head == null){
        	 throw new IndexOutOfBoundsException("Error: List is empty!");
        }else{
        	return head.value;
        }
    }

    // return (without removing) last element
    @Override
    public Object last() throws IndexOutOfBoundsException {
        if (size == 0 || head == null){
        	throw new IndexOutOfBoundsException("Error: List is empty!");
        }else{
            return tail.value;
        }
    }

    // return "true" if this queue contains the specified element
    @Override
    public boolean contains(Object o) {
        Node infrontNode = head;
        for (int i = 0; i < size; i++){
            if (infrontNode.value == o){
                return true;
            }
            infrontNode = infrontNode.next;
        }
        return false;
    }

    // element iterator
    @Override
    public Iterator<?> iterator() {
        return new ListIterator();
    }
}
