import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10000;
        long [] timeSelection = new long[10];
        long [] timesQuickSort = new long[10];
        for (int j = 0; j < 10; j++) {
            int [] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i]=(int)(Math.random()*1000);
            }
            int[] arr2 = Arrays.copyOf(arr1, n);
            long start1 = System.nanoTime();
            selectionSort(arr1, n);
            long end1 = System.nanoTime();
            long time1 = end1 - start1;
            timeSelection[j]=time1;
            long start2 = System.nanoTime();
            squickSort(arr2, 0, n-1);
            long end2 = System.nanoTime();
            long time2 = end2 - start2;
            timesQuickSort[j]=time2;
        }
        long sumSelection=0;
        long sumQuick=0;
        for (int i = 0; i < 10; i++) {
            sumSelection+=timeSelection[i];
            sumQuick+=timesQuickSort[i];
        }
        double timeForSelectionSort=sumSelection/10.0;
        double timeForQuickSort=sumQuick/10.0;
        timeForSelectionSort=timeForSelectionSort/10e9;
        timeForQuickSort=timeForQuickSort/10e9;
        System.out.println(timeForSelectionSort);
        System.out.println(timeForQuickSort);
    }
    // Selection Sort
    public static void selectionSort(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            int smallest = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
    // Quick Sort
    public static void squickSort(int[] arr, int low, int high){
        if (low<high) {
            int pi = partition(arr, low, high);
            squickSort(arr, low, pi-1);
            squickSort(arr, pi+1, high);
        }
    }
    static int partition (int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j <= high-1; j++) {
            if (arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}