package study;

public class Main {
    public static void main(String[] args) {
        System.out.println("Recursia vid 0 do 100:");
        recurсia(0);
        System.out.println(" ");
        System.out.println("Cykl vid 0 do 100:");
        cyklum(0);
    }

    public static void recurсia (int n) {
        if(n==100){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recurсia(n+1);
    }
    public static void cyklum (int n) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
