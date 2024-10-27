import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //1
        String name = "Tom";
        Consumer<String> sayName = someName-> {
            System.out.println("Hello "+someName+"!");
        };
        sayName.accept(name);
        // 2
        Predicate<Double> positive = x ->{
            if (x>0)
            {
                return true;
            }
            else {
                return false;
            }
        };
        System.out.println(positive.test(-3.0));
        // 3
        Function<Double, Double> abs = (x) ->{
            if (positive.test(x))
            {
                return x;
            }
            else {
                return x*(-1);
            }
        };
        System.out.println(abs.apply(-3.2));
        // 4
        BinaryOperator<Double> pow = (x,y)->{
          x = abs.apply(x);
          double result = Math.pow(x,y);
          return result;
        };
        System.out.println(pow.apply(3.0, 3.0));
        // 5
        Consumer<Double> printPow = x->{
            double y = 0.5;
            System.out.println(pow.apply(x, y));
        };
        printPow.accept(4.0);

        /*
        Predicate<Integer> even = a -> a%2 == 0;
        System.out.println(even.test(14));
        System.out.println(even.test(5));

        Function <Integer, Double> function = (x) ->
        {
            if (even.test(x))
            {
                return (double) x*x;
            }
            else{
                return Math.sqrt(x);
            }
        };

        Consumer<Integer> print = (x) -> {
          double result = function.apply(x);
            System.out.println("f("+x+")="+result );
        };
        print.accept(25);

        Function <Double, Double> Square = (r) -> {
            double S = 3.14*r*r;
            return S;
        };
        System.out.println(Square.apply(5.0));

        BinaryOperator<Integer> power = (x,y) -> {
            if (x>y){
                return (int) Math.pow(x,y);
            }
            else {
                return (int)Math.pow(x,y);
            }
        };
        System.out.println(power.apply(2,3));
         */

    }
}