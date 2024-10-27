public class Main {
    public static int [][] graph;//матриця суміжностей вершин графа
    public static int [] visited;// відвідані вершини
    public static int [] cost;// вартість шляху до вершин
    public static int [] previous;
    public static int start;// початкова вершина

    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE;// встановлення значення нескінченність
        visited = new int [6];
        cost = new int[6];
        previous = new int[6];
        graph = new int[][]{{0, 7, 9, 0, 0, 14},
                {7, 0, 10, 15, 0, 0},
                {9, 10, 0, 11, 0, 2},
                {0, 15, 11, 0, 6, 0},
                {0, 0, 0, 0, 6, 9},
                {14, 0, 2, 0, 9, 0}};
        for (int i = 0; i < 6; i++) {
            cost[i]=INF;//всі значення початкових відстаней встановлюються рівними нескінченності
        }
        start = 0;//початкова вершина, від якої будуть відраховуватись найкоротші відстані до інших вершин (вершина 1)
        cost[start] = 0;// найкоротша відстані до початкової вершини встановлюється рівною 0
        previous[start]=0;
        dijkstra(start);
        printResult();
    }

    public static void dijkstra(int start){
// Перераховуються відстані всіх суміжних вершин до вершини start
        for (int i = 0; i <cost.length; i++) {
            if (graph[start][i] > -1 && cost[i] > (graph[start][i] + cost[start]) && graph[start][i]!=0){
                cost[i] = graph[start][i] + cost[start];
                previous[i]=start;
            }
        }
// Знаходження мінімальної відстані серед невідвіданих вершин
        int j = minDist();
        if (j  == -1 )
            return;
        visited[j] = 1;//Зазначаємо, що вказана вершина є відвіданою
        dijkstra(j);// Рекурсивний виклик функції для нової вершини
    }
    public static int minDist(){
        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        for (int i=0; i<cost.length; i++){
// Пошук вершини з мінімальною відстанню серед невідвіданих.
            if (minDistance>cost[i] && visited[i] == 0){
                minDistance = cost[i];
                index = i;
            }
        }
        return index;
    }


    public static void printResult(){
        for (int i = 0; i <cost.length; i++) {
            System.out.println("Distance of node "+(i+1)+" from node "+(start+1)+" is "+cost[i]+" previous "+(previous[i]+1));
        }
    }
}