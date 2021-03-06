/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign2.exercise_5
 * 
 * @file_name TreeWordSet.java
 */
package ej222pj_assign2.exercise_5;

import java.util.Iterator;

/**
 * @author Eric
 *
 * @date 23 sep 2016 : @time 11:25:10
 *
 */
public class TreeWordSet implements WordSet {
	private Node rootNode = null;
	private int size = 0;
	
	@Override
	public Iterator<Word> iterator() {
		return new TreeWordSetIterator();
	}

	@Override
	public void add(Word word) {
		if(rootNode == null) rootNode = new Node(word);
		else if(!rootNode.contains(word)) rootNode.add(word);
		else return;
		
		size++;
	}

	@Override
	public boolean contains(Word word) {
		return rootNode.contains(word);
	}

	@Override
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		String words = "";
		Iterator<Word> wordIterator = iterator();
		
		while(wordIterator.hasNext()){
			words += wordIterator.next() + "\n";
		}
		
		return words;
	}

	private class Node {
		boolean visited = false;
		Node parent;
		Node left;
		Node right;
		Word word;
		
		public Node(Word w) {
			word = w;
		}
		
		public void add(Word w) {
			if(w.compareTo(word) < 0) {
				if(left == null) left = new Node(w);
				else left.add(w);
			}
			else if(w.compareTo(word) > 0) {
				if(right == null) right = new Node(w);
				else right.add(w); 
			}
		}
				
		public boolean contains(Word w) {
			if (w.compareTo(word) < 0) { 
				if (left == null) return false;
				else return left.contains(w);
			}
			else if (w.compareTo(word) > 0) { 
				if (right == null) return false;
				else return right.contains(w);
			}
			return true; 
		}
	}

	private class TreeWordSetIterator implements Iterator<Word> {
		Node node;
		
        public TreeWordSetIterator() {
        	node = rootNode;
        	
        	while(node.left != null) {
        		Node tempNode = node;
        		node = node.left;
        		node.parent = tempNode;
        	}        
		}
        
        public boolean hasNext() {
        	return node != null;
        }
        
        public Word next() {
        	node.visited = true;
        	Node nextNode = node;
        	
        	 if (node.right != null) {
        		  node = node.right;
        		  
        		  if(node.parent == null ) node.parent = nextNode;
        		  
                  while (node.left != null) {
                	  Node tempNode = node;
                	  node = node.left;
                	  node.parent = tempNode;
                  }
             }
        	 else {
                 while (node.visited) {
                	Node tempNode = node;
 					node.visited = false;
 					if(node.parent == null) {
 						node = null;
 						break;
 					}
 					node = tempNode.parent;
                 }
             }

        	return nextNode.word;
        }
	}
}