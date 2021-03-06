/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_5
 * 
 * @file_name HashWordSet.java
 */
package ej222pj_assign2.exercise_5;

import java.util.Iterator;

/**
 * @author Eric
 *
 * @date 23 sep 2016 : @time 11:25:01
 *
 */
public class HashWordSet implements WordSet {
	private Node[] buckets = new Node[8];
	private int size; 
	
	@Override
	public Iterator<Word> iterator() {
		return new HashWordSetIterator();
	}

	@Override
	public void add(Word word) {
		int bucketIndex = getBucketIndex(word);
		//First node
		Node node = buckets[bucketIndex]; 
		
		while (node != null) {
			//Search list for word
			if (node.value.hashCode() == word.hashCode() && node.value.equals(word)) return; 
			else node = node.next; 
		}
		
		//Add word
		node = new Node(word); 
		node.next = buckets[bucketIndex];
		buckets[bucketIndex] = node;
		size++;
		
		if (size == buckets.length) {
			rehash(); 
		}
	}

	@Override
	public boolean contains(Word word) {
		Node node = buckets[getBucketIndex(word)];
		
		while (node != null) { 
			//Search list for word
			if (node.value.hashCode() == word.hashCode() && node.value.equals(word)) return true;
			else node = node.next;
		}
		
		return false;
	}

	@Override
	public String toString() {
		String words = "";
		Iterator<Word> wordIterator = iterator();
		
		while(wordIterator.hasNext()) {
			words += wordIterator.next() + "\n";
		}
		
		return words;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	private int getBucketIndex(Word word) {
		int hc = word.hashCode();
		
		//Can't be negative
		if (hc < 0)	hc *= -1;
	
		return hc % buckets.length;
	}
	
	private void rehash() {
		Node[] temp = buckets; // Copy of old buckets
		buckets = new Node[2 * temp.length]; // New empty buckets
		size = 0;
		for (Node n : temp) { // Insert old values into new buckets
			if (n == null) continue; // Empty bucket
			
			while (n != null) {
				add(n.value); // Add elements again
				n = n.next;
			}
		}
	}
	
	private class Node {
		Word value;
		Node next = null;
		
		public Node(Word word) {
			value = word; 
		}
		
		public String toString () {
			return value.toString();
		}
	}
	
	private class HashWordSetIterator implements Iterator<Word> {
		private Node node;
		private int index = 0;
        
        public HashWordSetIterator() {
        	for(int i = 0; i < buckets.length; i++) {
        		if(buckets[i] != null) {
        			node = buckets[i];
        			index = i;
        			break;
        		}
        	}
		}
        
        @Override
        public boolean hasNext() {
            return node != null;
        }
        
        @Override
        public Word next() {
        	Node nextNode = node;
        	
        	if(node.next != null) node = node.next;
        	else {
        		index++;
        		while(index < size && buckets[index] == null) {
        			index++;
        		}
        		node = buckets[index];
			}
        	return nextNode.value;
        }
    }

}