package lab9_graph3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class implements an algorithm for obtaining a shortest path between two
 * given vertices s, v, assuming a path exists at all.
 * 
 * The first step is to create the BFS rooted tree, together with the levels of the tree and
 * a map that associates with each vertex its parent.
 * 
 * The second step is to do a recursion to obtain a shortest edge path P from s to v.
 * The recursion shortestEdgePath(P, s, v) works like this:
 *       if(s equals v) return P   //returns an empty list
 *       else {
 *       	P = P U {(v, parent(v))}
 *       	return shortestEdgePath(P, s, parent(v))
 *       }
 *  
 *  The final step is to read the endpoints of the edges obtained in shortestEdgePath to obtain 
 *  a list of vertices as the final return value
 *  
 *  The running time is O(n+m) to set up the tree, levels, parents. The recursion requires O(n) in 
 *  the worst case (running time is proportional to number of self-calls, which is at worst the 
 *  total number n of vertices). The last step is just a scan of at most n edges, so requires O(n).
 *  The total running time is therefore is O(n+m).
 *  
 *  Extra space involves 3 data structures: the BFS rooted tree, the edge path P,
 *  and the final return path, each of which consumes O(n) space.
 *     
 */
public class ShortestPath extends BreadthFirstSearch {
	//private ArrayList<List> levels = new ArrayList<List>();
	//private HashMap<Vertex, Integer> levelsMap = new HashMap<Vertex, Integer>();
	//private List<Edge> shortestPath = new ArrayList<Edge>();
	private HashMap<Vertex, Vertex> parentMap = new HashMap<Vertex, Vertex>();
	
	/** Assumes g is connected */
	public ShortestPath(Graph g) {
		super(g);
		
	}
	
	@Override
	protected void handleInitialVertex(Vertex s) {
		super.handleInitialVertex(s);
		//start vertex has no parent
		parentMap.put(s,  null);
	}
	
	
	@Override
	protected void processEdge(Edge e) {
		//first component is child, second component is parent
		parentMap.put(e.u, e.v);
	}
	
	
	public List<Vertex> computeShortestPath(Vertex s, Vertex v) {
		start(s);
		//this computes the sequence of edges from v to s
		List<Edge> edgePath = shortestEdgePath(new ArrayList<Edge>(), s, v);
		System.out.println("Edge path: " + edgePath);
		List<Vertex> path = new ArrayList<>();
		path.add(s);
		if(!edgePath.isEmpty()) {//means that s.equals(v)
			for(int i = edgePath.size() - 1; i >= 0; --i) {
				path.add(edgePath.get(i).u);
			}
		}
		return path;
		
	}
	
	private List<Edge> shortestEdgePath(List<Edge> temp, Vertex s, Vertex v) {
		if(v.equals(s)) {
			return temp;
		}
		Vertex w = parentMap.get(v);
		temp.add(new Edge(v, w));
		return shortestEdgePath(temp, s, w);
	}
	
}
