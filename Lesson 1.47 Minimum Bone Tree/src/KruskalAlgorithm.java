import java.util.ArrayList;
import java.util.Arrays;

public class KruskalAlgorithm {
    public class Subset {
        int parent;
        int rank;
    }

    public void findPrintMST(ArrayList<Edge> graph[], Edge edges[]) {
        // Відсортуємо ребра в порядку зростання ваги, так як цього вимагає алгоритм Крускала
        Arrays.sort(edges, Edge.comp);
        // Створюємо масив, в який буде зберігатись сформоване дерево
        //Відповідно до властивості, кількість ребер в кістяковому дереві на 1 менше за кількість його вершин, тому розмірність створюваного масиву буде дорівнювати graph.length-1
        Edge mst[] = new Edge[graph.length - 1];
        //Заповнюємо мінімальне кістякове дерево пустими ребрами зі значеннями -1 за замовчуванням
        for (int i = 0; i < graph.length - 1; i++) {
            mst[i] = new Edge(-1, -1, -1);
        }
        // Установити батька для кожної вершини
        Subset subsets[] = new Subset[graph.length];
        for (int i = 0; i < graph.length; i++) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }

        int e = 0;//кількість ребер у мінімальному кістяковому дереві. Дане значення буде нарощуватись при додаванні ребра
// Один за одним перебираємо ребра
        for (int i = 0; i < edges.length; i++) {
            // Знаходимо для кожної вершини її батьківську вершину
            int x = find(subsets, edges[i].from);
            int y = find(subsets, edges[i].to);
            // Якщо вершини на кінцях ребра мають різні значення, то додаємо це ребро до мінімального кістякового дерева
            if (x != y) {
                mst[e].from = edges[i].from;
                mst[e].to = edges[i].to;
                mst[e].weight = edges[i].weight;
                Union(subsets, x, y);
                e++;
            }
            // Якщо всі вершини були додані до мінімального кістякового дерева, то слід зупинити процес побудови дерева
            if (e == graph.length - 1) {
                break;
            }
        }
        // Здійснюємо друк мінімального кістякового дерева
        for (int i = 0; i < graph.length - 1; i++) {
            System.out.println("From " + mst[i].from + " to " + mst[i].to + " weight " + mst[i].weight);
        }
    }

    // Знайти старшинство батьківства
    private int find(Subset subsets[], int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

   private void Union(Subset subsets[], int x, int y) {
//Знаходимо батьківські елементи для x та y
        int xRoot = find(subsets, x);
        int yRoot = find(subsets, y);
// Для батьківських вузлів встановлюємо ранг більшого з них
        if (subsets[xRoot].rank < subsets[yRoot].rank) {
            subsets[xRoot].parent = yRoot;
        } else if (subsets[xRoot].rank > subsets[yRoot].rank) {
            subsets[ yRoot].parent = xRoot;
        } else {
            // Якщо ранги однакові, то встановлюємо для одного з кінців ребра значення батьківського елемента іншого кінця ребра та збільшуємо ранг другого на одиницю
            subsets[yRoot].parent = xRoot;
            subsets[xRoot].rank++;
        }
    }
}
