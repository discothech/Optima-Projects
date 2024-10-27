public class Main {
    public static void main(String[] args) {
        int [] a = {1, 3, 4, 5, 2};
        int n = a.length;
        for (int i = 0; i<n-1; i++){
            for (int j = 0; j<n-i-1; j++){
                if (a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i<n; i++){
            System.out.println(a[i]);
        }


    }
}