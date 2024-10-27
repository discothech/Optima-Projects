package study;

public class Main {

    public static void main(String[] args)
    {
        countDown(10);
    }

    public static void countDown(int n){
        if(n==0){
            System.out.println(n);
            return;
    }
    System.out.println(n);
        countDown(n-1);
    }
}