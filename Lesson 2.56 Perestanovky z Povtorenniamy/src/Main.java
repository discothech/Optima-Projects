import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // комбінаторика
        System.out.println(permutation(new int[]{2,2,2},13));
        System.out.println((int)rozmischeniaPovtor(4,4));
        System.out.println(combinationPovtor(5,3));
    }

    // Перестановки з повтореннями
    public static BigInteger permutation(int[] arr, int n){
        BigInteger result= factorial(n);
        for(int i=0; i<arr.length; i++){
            BigInteger n1=factorial(arr[i]);
            result=result.divide(n1);
        }
        return result;
    }
    public static BigInteger factorial(int n){
        BigInteger result= BigInteger.valueOf(1);
        while(n!=0){
            result = result.multiply(BigInteger.valueOf(n));
            n--;
        }
        return result;
    }

    // перестановки з повторюванними цифрами
    public static double rozmischeniaPovtor(int n, int m){
        return Math.pow(n,m);
    }

    // Комбінації з повтореннями
    public static BigInteger combinationPovtor(int n, int m){
        return combination(n+m-1,m);
    }
    public static BigInteger combination(int n, int m){
        BigInteger result = factorial(n).divide(factorial(n-m).multiply(factorial(m)));
        return result;

    }
}