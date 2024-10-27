import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(0, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        g.addEdge(6, 2);

        g.DFS(0);

        // g.BFS(1);

    }
}