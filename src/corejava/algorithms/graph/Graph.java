package corejava.algorithms.graph;

import java.util.LinkedList;

public class Graph {
    private final int V;
    private LinkedList<Integer> adj[];
    private int E=0;

    public Graph(int V) {
        this.V = V;
        this.adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            this.adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w){
        this.adj[v].add(w);
    }

    public int getV() {
        return V;
    }

    public Iterable<Integer> adj(int V){
        return this.adj[V];
    }
}
