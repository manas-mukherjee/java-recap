package corejava.algorithms.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphDFS {
    private boolean marked[];
    private int edgeTo[];
    private Graph graph;

    public GraphDFS(Graph graph, int currentNode) {
        this.graph = graph;
        this.marked = new boolean[graph.getV()];
        this.edgeTo = new int[graph.getV()];
        dfsSearch(currentNode);
    }

    public void dfsSearch(int currentNode) {
        this.marked[currentNode] = true;

        for (Integer nextNode : this.graph.adj(currentNode)){
            if (!this.marked[nextNode]){
                this.edgeTo[nextNode] = currentNode;
                dfsSearch(nextNode);
            }
        }
    }

    public boolean hasPathTo(int v){
        return this.marked[v];
    }

    public List<Integer> hasPathToVertex(int destinationVertext, int startNode){
        List<Integer> path = new ArrayList<>();

        if (!hasPathTo(destinationVertext))
            return null;
        else {
            for (Integer x = destinationVertext; x!=startNode; x=edgeTo[x]){
                path.add(x);
            }
            path.add(startNode);
        }
        Collections.reverse(path);
        return path;
    }
}
