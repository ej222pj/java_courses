/**
 * @project_name 2DV600
 *
 * @package_name ej222pj
 * 
 * @file_name MyConnectedComponents.java
 */
package ej222pj;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import graphs.ConnectedComponents;
import graphs.DFS;
import graphs.DirectedGraph;
import graphs.Node;

/**
 * @author Eric
 * @param <E>
 *
 * @date 27 sep. 2016 : @time 19:07:56
 * 
 * Two nodes a and b are directly connected if their exist an edge (a,b) 
 * or an edge (b,a). Two nodes a and k are connected if there exist a sequence
 * of nodes [a,b,c,d, ... j,k] such that [a,b], [b,c], [c,d], [d,e], ..., [j,k]
 * are all directly connected.
 * <p/>
 * Problem: find a partitioning of the graph nodes such that two nodes belongs to the 
 * same partitioning if and only if they are connected.
 * </p>
 * The result is a collection of node collections.
 *
 */
public class MyConnectedComponents<E> implements ConnectedComponents<E> {

	@Override
	public Collection<Collection<Node<E>>> computeComponents(DirectedGraph<E> dg) {
		Set<Collection<Node<E>>> connectedComponentsHashSet = new HashSet<>();
		Set<Node<E>> visitedHashSet = new HashSet<>();
		DFS<E> myDFS = new MyDFS<E>();
	    
		for (Node<E> node : dg) {
	    	Set<Node<E>> component  = new HashSet<>();
	    	if (visitedHashSet.contains(node) == false) {
	    		visitedHashSet.add(node);
	    		component.add(node);

	    		Collection<Node<E>> reachable = myDFS.dfs(dg, node);
	    		for (Node<E> reachableNode : reachable) {
	    			visitedHashSet.add(reachableNode);
	    			component.add(reachableNode);
	    		}
	    	}

	    	for (Collection<Node<E>> collectionNode : connectedComponentsHashSet) {
	    		// disjoint - Returns true if the two specified collections
	    		//			 have no elements in common.
	    		if (Collections.disjoint(collectionNode, component) == false) {
	    			collectionNode.addAll(component);
	    			component.clear();
	    		}
	    	}
	    	if (component.isEmpty() == false) {
	    		connectedComponentsHashSet.add(component);
	    	}
	    }
	    return connectedComponentsHashSet;
	}
}