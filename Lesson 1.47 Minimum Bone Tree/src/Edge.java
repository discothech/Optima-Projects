import java.util.Comparator;

public class Edge {
    int from;//початкова вершина ребра
    int to;//кінцева вершина ребра
    int weight;//вага ребра
    //Конструктор для створення ребра
    public Edge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public static final Comparator<Edge> comp = new Comparator<Edge>() {
        @Override
        //Перевизначаємо метод, який дозволяє порівнювати два ребра відповідно до їх ваги
        public int compare(Edge o1, Edge o2) {
            return Integer.compare(o1.weight, o2.weight);
        }
    };
}
