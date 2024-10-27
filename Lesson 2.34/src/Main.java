import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[100000];
        for (int i = 0; i<100000; i++){
            arr[i] = 100000 - i;
        }
        long startTime = System.currentTimeMillis();
        Arrays.sort(arr);
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println(time);
    }
}