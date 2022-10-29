package lab8_graph2;

import java.util.HashMap;

public class ShortestPathLength extends BreadthFirstSearch {

    HashMap<Vertex, Integer> levels = new HashMap<>();
    int level;

    public ShortestPathLength(Graph graph) {
        super(graph);
        this.level = 0;
    }


}
