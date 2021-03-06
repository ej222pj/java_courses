/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name listMain.java
 */
package ej222pj_assign1;

import java.util.Iterator;

/**
 * @author Eric
 *
 * @date 9 sep 2016 : @time 17:26:38
 *
 */
public class QueueMain {
	public static void main(String[] args){
		Queue list = new Queue();

        if(list.isEmpty()) {
            System.out.println("List is Empty");
        }
        
        try {
            list.first();
        } catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try {
            list.last();
        } catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try {
            list.dequeue();
        } catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        //Should be 0
        System.out.println("List Size = " + list.size());
        
        list.enqueue(new TestNode(1, "First"));
        //Should be 1
        System.out.println("List Size = " + list.size());
        
        list.enqueue(new TestNode(2, "Second"));
        //Should be 2
        System.out.println("List Size = " + list.size());

        if (!list.isEmpty()){
            System.out.println("List Is Not Empty!");
        }

        //First object
        Object firstObject = list.first();
        System.out.println("First object: ");
        TestNode testNode = ((TestNode) firstObject);
        System.out.println(testNode.value + " " + testNode.name);
        
        //Last object
        Object lastObject = list.last();
        System.out.println("Last object: ");
        testNode = ((TestNode) lastObject);
        System.out.println(testNode.value + " " + testNode.name);        

        Iterator<?> iterator = list.iterator();
        System.out.println("Iterate List");
        while(iterator.hasNext()){
            Object testIterator = iterator.next();
            TestNode nodeIterator = ((TestNode) testIterator);
            System.out.println(nodeIterator.name + " - " + nodeIterator.value);
        }        
    }

    private static class TestNode{
        int value;
        String name;

        public TestNode(int value, String name){
            this.value = value;
            this.name = name;
        }
    }
}