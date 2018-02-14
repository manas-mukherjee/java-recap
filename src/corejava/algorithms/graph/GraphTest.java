package corejava.algorithms.graph;

public class GraphTest {
    @org.junit.Test
    public void addEdge() throws Exception {
    }

    @org.junit.Test
    public void getV() throws Exception {
    }

    @org.junit.Test
    public void adj() throws Exception {
    }

    @org.junit.Test
    public void shouldSearchGraphInBFS() throws Exception {
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

        for (int i = 0; i < vertexCount; i++) {
            System.out.format("[%d] %s \n", i, graph.adj(i).toString());
        }
    }
}