import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zavdaniia 1
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter first number:");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println( a + " + "+ b + " = " + sum);

        // Zavdaniia 2
        int a1 = 5;
        int inversion = ~a1;
        System.out.println("1. INVERSIA:  " + inversion);
        int a2 = 15;
        int b2 = 14;
        int bitAND = a2 & b2;
        System.out.println("2. BITOVE AND:  " + bitAND);
        int a3 = 44;
        int b3 = 24;
        int bitOR = a3 | b3;
        System.out.println("3. POBITOVE ABO:  " + bitOR);
        int a4 = 123;
        int b4 = 32;
        int bitEXOR = a4 ^ b4;
        System.out.println("4. POBITOVE ABO VUKLIUCHAIE:  " + bitOR);
        int a5 = 234;
        int bitMoveR = a5 >> 4;
        System.out.println("5. ZSUV VPRAVO:  " + bitMoveR);
        int a6 = -124;
        int bitMoveL = a6 << 4;
        System.out.println("6. ZSUV VLIVO:  " + bitMoveL);

        // Zavdaniia 3
        int A = 34, B = 21;
        double C = 33.3, D = 12.5;
        // Створимо змінну логічного типу, оскільки результат виразу (!(А==B)) && (C >= D) буде належати логічному типу.
        boolean result = (!(A==B)) && (C >= D);
        // 34 == 21 повертає false.
        // !(34 == 21) = !(false) = true.
        // 33.3 >= 12.5 повертає true.
        // true && true повертає true.
        if (result == true) {
            System.out.println(result);
        }
        else {
            System.out.println("false");
        }
    }
}