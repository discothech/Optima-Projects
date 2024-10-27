public class Main {
    public static void main(String[] args) {
        Car [] list = new Car[6];
        list[0] = new Car("AA1234", 2009);
        list[1] = new Car("HI1224", 2007);
        list[2] = new Car("AZ1224", 2020);
        list[3] = new Car("KI1124", 2010);
        list[4] = new Car("FD3214", 2012);
        list[5] = new Car("KA7062", 2001);
        System.out.println("Before Sort:");
        for (int i=0; i<6; i++){
            System.out.println(list[i].toString());
        }
        quickSort(list, 0, 5);
        System.out.println("");
        System.out.println("After Sort:");
        for (int i=0; i<6; i++){
            System.out.println(list[i].toString());
        }
    }
    public static void quickSort(Car arr [], int low, int high){
        if (low<high){
            int pi = partition(arr, low, high);
            quickSort(arr,low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    static int partition(Car arr[], int low, int high){
        Car temp;
        Car pivot = arr[high];
        int i = low-1;
        for (int j=low; j<=high-1; j++){
            if (arr[j].compareTo(pivot)<0){
                i++;
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high]=temp;
        return i+1;
    }
}