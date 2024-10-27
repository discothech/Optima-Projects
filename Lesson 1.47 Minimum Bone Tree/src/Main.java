import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 4, 3));
        graph[1].add(new Edge(1, 4, 2));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 4, 8));
        graph[4].add(new Edge(4, 0, 3));
        graph[4].add(new Edge(4, 1, 2));
        graph[4].add(new Edge(4, 3, 8));

        Edge[] edges = new Edge[4];
        edges[0] = new Edge(0, 4, 3);
        edges[1] = new Edge(4, 1, 2);
        edges[2] = new Edge(4, 3, 8);
        edges[3] = new Edge(3, 2, 1);

        KruskalAlgorithm kruskalAlgorithm = new KruskalAlgorithm();
        kruskalAlgorithm.findPrintMST(graph, edges);
    }
}