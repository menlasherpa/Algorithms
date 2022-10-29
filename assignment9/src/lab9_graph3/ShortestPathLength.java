package lab9_graph3;
import java.util.*;

public class ShortestPathLength extends BreadthFirstSearch {
	private HashMap<Vertex, Integer> levelsMap = new HashMap<>();
	public ShortestPathLength(Graph graph) {
		super(graph);
	}

	@Override
	protected void handleInitialVertex(Vertex v) {
		if(v != null){
			setHasBeenVisited(v);
			processVertex(v);
			levelsMap.put(v,0);
			makeVertexCurrent(v);
		}
	}

	@Override
	public void processEdge(Edge e) {
		Vertex child = e.u;
		Vertex parent = e.v;
		int levelOfParent = levelsMap.get(parent);
		levelsMap.put(child, levelOfParent + 1);
	}

	public int getShortestPathLength(Vertex s, Vertex w) {
		start(s);
		int returnVal = -1;
		if(levelsMap.get(w) != null) {
			returnVal = levelsMap.get(w);
		}
		return returnVal;
	}


}
