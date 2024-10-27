public class Main {
    public static void main(String[] args) {
        public int search ( int[] arr, int key){
            return find(arr, 0, arr.length - 1, key);
        }
    }
    public int find(int [] arr, int left, int right, int key){
            if (left>right){
                return -1;
            }
            int m = left + (right-left)/2;
            if (arr[m]==key){
                return m;
            }
            if (left==right){
                return -1;
            }
            if (arr[m]>key){
                return find(arr, left, m-1, key);
            }
            else {
                return find(arr, m+1, right, key);
            }
    }
}
// Послідовний пошук
    /*public static void main(String[] args) {
       int []arr = {6, 7, 8, 12, 2, 3, 4};
        System.out.println(linearSearch(arr, 2));
        }
    public static int linearSearch(int arr[], int key){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                return i;
            }
        }
        return index;
    }
     */