package corejava.algorithms.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBFS {
    private boolean marked[];
    private Graph graph;

    public GraphBFS(Graph graph) {
        this.graph = graph;
        this.marked = new boolean[graph.getV()];
    }

    public List<Integer> bfsSearch(int startingNode) {
        List<Integer> result = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        this.marked[startingNode] = true;
        queue.add(startingNode);

        while (queue.size() != 0) {
            Integer newVertex = queue.poll();
            result.add(newVertex);

            for (int node : this.graph.adj(newVertex)) {
                if (!this.marked[node]) {
                    queue.add(node);
                    this.marked[node] = true;
                }
            }
        }
        return result;
    }
}
