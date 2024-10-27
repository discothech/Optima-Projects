public class FloydUorshalMatrix {
    static final int INF = Integer.MAX_VALUE;
    public void floyd(int [][] Matrix, int [] vertex)
    {
        int [][] S = new int[Matrix.length][Matrix.length];
        int [][] W = new int[Matrix.length][Matrix.length];
        for (int i = 0; i < vertex.length; i++)
        {
            for (int j = 0; j < vertex.length; j++)
            {
                S[i][j]=Matrix[i][j];
                if (i==j){
                    W[i][j]=0;
                }
                else {
                    W[i][j]=j+1;
                }
            }
        }
        for (int k = 0; k < vertex.length; k++) {
            for (int i = 0; i < vertex.length; i++) {
                for (int j = 0; j < vertex.length; j++) {
                    if(i==j) continue;
                    int temp = (S[i][k] == INF || S[k][j] == INF) ? INF : (S[i][k]+S[k][j]);
                    if (S[i][j]>temp)
                    {
                        S[i][j]=temp;
                        W[i][j]=k+1;
                    }
                }
            }
        }
        // Alhorytm Poshuku
        System.out.println("Matrix S:");
        for (int i = 0; i < vertex.length; i++)
        {
            for (int j = 0; j < vertex.length; j++) {
                if (S[i][j]==INF){
                    System.out.printf(" INF ");
                }
                else {
                    System.out.printf("%d  ",S[i][j]);
                }
            }
            System.out.println("\n");
        }
        System.out.println("Matrix W:");
        for (int i = 0; i < vertex.length; i++)
        {
            for (int j = 0; j < vertex.length; j++) {
                System.out.printf("%d  ",W[i][j]);
            }
            System.out.println("\n");
        }
    }
}
