/**
 * @project_name 2DV600
 *
 * @package_name ej222pj
 * 
 * @file_name MyBFS.java
 */
package ej222pj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import graphs.BFS;
import graphs.DirectedGraph;
import graphs.Node;

/**
 * @author Eric
 * @param <E>
 *
 * @date 27 sep. 2016 : @time 19:06:02
 *
 */
public class MyBFS<E> implements BFS<E>{

	private List<Node<E>> bfsRecursive(HashSet<Node<E>> hashSet, HashSet<Node<E>> hashSetVisited, List<Node<E>> nodeList){
		Iterator<Node<E>> setIterator = hashSet.iterator();
		hashSet = new HashSet<>();
		
		while(setIterator.hasNext()) {
			Node<E> node = setIterator.next();
			
			if(hashSetVisited.contains(node) == false) {
				node.num = nodeList.size() + 1;
				hashSetVisited.add(node);
				nodeList.add(node);
			}
			
			Iterator<Node<E>> succIterator = node.succsOf();
			
			while(succIterator.hasNext()) {
				Node<E> succ = succIterator.next();
				if(hashSetVisited.contains(succ) == false) {
					hashSet.add(succ);
				}
			}		
		}

		if(hashSet.isEmpty() == false) {
			bfsRecursive(hashSet, hashSetVisited, nodeList);
		}
		return nodeList;
	}
	
	/**
     * Returns the nodes visited by a breadth-first search starting from
     * the given root node. Each visited node is also attached with 
     * a breadth-first number.
     */
	@Override
	public List<Node<E>> bfs(DirectedGraph<E> graph, Node<E> root) {
		HashSet<Node<E>> hashSetVisited = new HashSet<>();
		List<Node<E>> nodeList = new ArrayList<Node<E>>();
		HashSet<Node<E>> hashSet = new HashSet<>();
		
		hashSet.add(root);
		
		return bfsRecursive(hashSet, hashSetVisited, nodeList);
	}

	/**
     * Returns the nodes visited by a breadth first search starting from
     * an arbitrary set of nodes. All nodes are visited. Each visited node is 
     * also attached with a breadth-first number.
     */  
	@Override
	public List<Node<E>> bfs(DirectedGraph<E> graph) {
		List<Node<E>> nodeList = new ArrayList<Node<E>>();
		HashSet<Node<E>> hashSetVisited = new HashSet<>();
		Iterator<Node<E>> heads = graph.heads();
		HashSet<Node<E>> hashSet;
		
		if(graph.headCount() == 0) {
			hashSet = new HashSet<>();
			hashSet.add(graph.getNodeFor(graph.allItems().get(0)));
			nodeList = bfsRecursive(hashSet, hashSetVisited, nodeList);
		}
		else {
			while(heads.hasNext()) {
				hashSet = new HashSet<>();
				hashSet.add(heads.next());
				nodeList = bfsRecursive(hashSet, hashSetVisited, nodeList);
			}
		}
		return nodeList;
	}
}
