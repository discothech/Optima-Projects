package study;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void countDown(int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        countDown(n-1);
    }
    public static void countDown2(int n){
        for(int i = n; i>=0; i++){
            System.out.println(i);
        }
    }
}