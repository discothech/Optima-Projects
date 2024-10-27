public class Main {
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int [][] Matrix =
                {
                        {0,3,INF,4,INF,INF,INF,INF,INF},//v0
                        {INF,0,1,5,INF,INF,INF,INF,INF},//v1
                        {INF,INF,0,4,3,INF,INF,INF,INF},//v2
                        {INF,INF,INF,0,INF,INF,6,INF,INF},//v3
                        {INF,INF,INF,INF,0,8,INF,3,INF},//v4
                        {INF,INF,INF,5,INF,0,INF,INF,INF},//v5
                        {INF,INF,INF,INF,INF,INF,0,INF,INF},//v5
                        {INF,INF,INF,INF,INF,2,INF,0,INF},//v6
                        {INF,INF,INF,INF,INF,INF,2,-5,0},//v7
                };
        int[] vertex = {
                1,2,3,4,5,6,7,8,9
        };
        FloydUorshalMatrix findway = new FloydUorshalMatrix();
        findway.floyd(Matrix, vertex);
        //System.out.println("Hello world!");
    }
}