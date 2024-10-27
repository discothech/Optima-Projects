import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("15! = " + factorial(5)+" variantiv");
        System.out.println("Rozmischenia A z 15 po 3: "+(rozmischenia(15,3)+" variantiv"));
        System.out.println("Kombinatia kommand C z 15 po 3: "+(combination(15,3))+" variantiv");
    }
    // Перестановка
    public static BigInteger factorial(int n){
        BigInteger result= BigInteger.valueOf(1);
        while(n!=0){
            result = result.multiply(BigInteger.valueOf(n));
            n--;
        }
        return result;
    }
        // Розміщення
    public static BigInteger rozmischenia(int n, int m){
        BigInteger result = factorial(n).divide(factorial(n-m));
        return result;
    }

        // Сполучення
    public static BigInteger combination(int n, int m){
        BigInteger result = factorial(n).divide(factorial(n-m).multiply(factorial(m)));
        return result;
    }
}