package corejava.algorithms.graph;

import org.junit.Test;

import java.util.List;

public class GraphDFSTest {
    private static final Graph GRAPH;

    static {
        GRAPH = createGraph();
    }

    private static Graph createGraph() {
        int vertexCount = 7;

        Graph graph = new Graph(7);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);

        graph.addEdge(1, 0);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        graph.addEdge(2, 0);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        graph.addEdge(3, 1);

        graph.addEdge(4, 1);

        graph.addEdge(5, 2);

        graph.addEdge(6, 2);

        return graph;
    }

    @Test
    public void bfsSearch() throws Exception {
        GraphDFS graphBFS = new GraphDFS(GRAPH,0);
        List<Integer> bfsResult = graphBFS.hasPathToVertex(2,0);
        System.out.println(bfsResult);
    }

}