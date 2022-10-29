import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem2 {

    class Node {
        boolean isVisited;
        int value;
        List<Node> neighBorsNode;

        Node(int value) {
            this.value = value;
            isVisited = false;
            neighBorsNode = new ArrayList<Node>();

        }

        public void addNeighborNode(Node n) {
            neighBorsNode.add(n);
        }

        public void setVisited(boolean value) {
            this.isVisited = value;
        }

        public boolean getVisited() {
            return this.isVisited;
        }

        public List<Node> getNeighBorsNodes() {
            return this.neighBorsNode;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + value;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Node other = (Node) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (value != other.value)
                return false;
            return true;
        }

        private Problem2 getEnclosingInstance() {
            return Problem2.this;
        }

    }

    public List<Node> initialization() {
        Node node1 = new Node(7);
        Node node2 = new Node(9);
        Node node3 = new Node(5);
        Node node4 = new Node(10);
        Node node5 = new Node(1);
        Node node6 = new Node(0);
        Node node7 = new Node(11);
        Node node8 = new Node(111);
        node1.addNeighborNode(node2);
        node1.addNeighborNode(node3);
        node1.addNeighborNode(node4);
        node2.addNeighborNode(node3);
        node3.addNeighborNode(node2);
        node3.addNeighborNode(node7);
        node3.addNeighborNode(node5);

        List<Node> listNode = new ArrayList<Node>();
        listNode.add(node1);
        listNode.add(node2);
        listNode.add(node3);
        listNode.add(node4);
        listNode.add(node5);
        listNode.add(node6);
        listNode.add(node7);
        listNode.add(node8);

        return listNode;
    }

    public static void main(String[] args) {
        Problem2 graph = new Problem2();
        List<Node> nodes = graph.initialization();
        System.out.println("Path between two nodes 4 and 7: "+graph.pathExists(nodes.get(4), nodes.get(7)));
        graph.resetGraph(nodes);
        System.out.println("Number Of Connected Components: "+graph.numOfComponents(nodes));
        graph.resetGraph(nodes);
        System.out.println("Has Cycle in Graph: " + graph.hasCycle(nodes));

    }

    public boolean pathExists(Node source, Node destination) {
        // Problem2 Traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr.equals(destination)) {
                return true;
            }
            curr.setVisited(true);
            for (Node neighNode : curr.getNeighBorsNodes()) {
                if (!neighNode.getVisited()) {
                    queue.add(neighNode);
                }
            }
        }
        return false;
    }

    public int numOfComponents(List<Node> nodes) {
        int numComponents = 0;
        Queue<Node> queue = new LinkedList<>();
        for (Node aNode : nodes) {
            if (!aNode.getVisited()) {
                numComponents++;
                queue.add(aNode);
                while (!queue.isEmpty()) {
                    Node curr = queue.poll();
                    curr.setVisited(true);
                    for (Node neighNode : curr.getNeighBorsNodes()) {
                        if (!neighNode.getVisited()) {
                            queue.add(neighNode);
                        }
                    }
                }
            }
        }
        return numComponents;
    }

    public boolean hasCycle(List<Node> nodes) {
        Queue<Node> queue = new LinkedList<>();
        for (Node aNode : nodes) {
            if (!aNode.getVisited()) {
                queue.add(aNode);
                while (!queue.isEmpty()) {
                    Node curr = queue.poll();
                    curr.setVisited(true);
                    for (Node neighNode : curr.getNeighBorsNodes()) {
                        if (!neighNode.getVisited()) {
                            queue.add(neighNode);
                        }
                        else {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    private void resetGraph(List<Node> nodes) {
        for (Node aNode : nodes) {
            aNode.setVisited(false);
        }
    }
}
