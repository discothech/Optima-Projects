import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int V; // кількість вершин
    private LinkedList<Integer> adj[]; //масив списків, який зберігає всі сусідні вершини
    Graph(int V) {
        this.V = V; // задання кількості вершин в графі
        adj = new LinkedList[V];//створюємо масив списків
        for (int i=0; i<V; i++)
            adj[i] = new LinkedList();// для кожної вершини створюємо список сусідніх вершин
    }
    // функція додавання ребра в графі
    void addEdge(int v, int w) {
        adj[v].add(w);// встановлення зв’язку (v,w)
    }

    void DFSUtil(int v, boolean visited[]){
        visited[v]=true;
        System.out.print(v+"");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    void DFS(int v){
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
    /*
    void BFS(int s){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>(); //Створюємо чергу у вигляді зв’язного списку.
        // Позначаємо вузол як відвіданий та додаємо його до списку:
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.remove();
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
     }
     */
}
