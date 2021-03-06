/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_4
 * 
 * @file_name Queue.java
 */
package ej222pj_assign2.exercise_4;

/**
 * @author Eric
 *
 * @date 19 sep 2016 : @time 16:45:33
 *
 */
public interface Queue<E> extends Iterable<E> {  
    int size();                          // current queue size 
    boolean isEmpty();                   // true if queue is empty 
    void enqueue(E element);             // add element at end of queue 
    E dequeue();                         // return and remove first element. 
    E first();                           // return (without removing) first element 
    E last();                            // return (without removing) last element 
}