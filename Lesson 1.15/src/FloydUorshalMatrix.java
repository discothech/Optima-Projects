public class FloydUorshalMatrix {


    static final int INF = Integer.MAX_VALUE;   // нескінченність

    public void floyd(int[] mVexs, int[][] mMatrix) {

        int[][] W = new int[mMatrix.length][mMatrix.length];

        int[][] S = new int[mMatrix.length][mMatrix.length];

        // Ініціалізація матриці S та W

        for (int i = 0; i < mVexs.length; i++) {

            for (int j = 0; j < mVexs.length; j++) {

                S[i][j] = mMatrix[i][j];

                W[i][j] = j;

            }

        }

        // Розрахунок найкоротшого шляху

        for (int k = 0; k < mVexs.length; k++) {

            for (int i = 0; i < mVexs.length; i++) {

                for (int j = 0; j < mVexs.length; j++) {

                    // Пошук мінімальної відстані Sk[i,j]=min(Sk-1[i,j], Sk-1[i,k]+Sk-1[k,j])

                    if(i==j) continue;

                    int tmp = (S[i][k] == INF || S[k][j] == INF) ? INF : (S[i][k] + S[k][j]);

                    if (S[i][j] > tmp) {

                        S[i][j] = tmp;

                        W[i][j] = W[i][k];

                    }

                }

            }

        }

        System.out.printf("floyd: \n");

        for (int i = 0; i < mVexs.length; i++) {

            for (int j = 0; j < mVexs.length; j++)

                System.out.printf("%2d  ", S[i][j]);

            System.out.printf("\n");

        }

    }


    public static void main(String[] args) {


        FloydUorshalMatrix matrix = new FloydUorshalMatrix();

        int[] vertex = {1,2,3,4,5};

        int [][] Matrix = {

                {0,INF,3, INF,2},

                {-2,0,4, INF, INF},

                {INF, -5, 0, INF, INF},

                {3, 1, -1, 0, 9},

                {INF, 7, INF, INF, 0}

        };

        matrix.floyd(vertex,Matrix);

    }



}
