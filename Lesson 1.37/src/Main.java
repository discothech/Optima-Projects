import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1={1,0,2,4,3};
        int[] arr2=Arrays.copyOf(arr1, 5);
        choisenSort(arr1, 5);
        quickSort(arr2, 5);
        System.out.println(Math.random()*100);

        // Алгоритм сортування вибором

        // Алгоритм швидкого сортування

        System.out.println("Hello world!");
    }
}