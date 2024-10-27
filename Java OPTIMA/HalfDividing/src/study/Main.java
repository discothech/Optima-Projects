package study;

public class Main {
    public static void main(String[] args) {
        System.out.println(halfDivision(1, 2, 0.01));
        System.out.println(Newton(1, 2, 0.01));
    }
        public static double halfDivision(double a, double b, double ebs){
            double x;
            do {
                x = (a+b)/2;// середина відрізка
                if(f(a)*f(x)<0){
                    b = x;
                    }
                else if(f(b)*f(x)<0){
                    a = x;
                    }
            }while(Math.abs(f(x))>ebs);
            return x;
        }
        public static double f(double x){
            return x*x*x-x-1;
        }
        public static double Newton (double a, double b, double e){
            double x;
            if(f(a)*secondDeriv(a)>0){
                x = a;
            }
            else{
                x = b;
            }
            while(Math.abs(f(x))>e){
                x = x - f(x)/firstDeriv(x);
            }
            return x;
        }
        public static double firstDeriv(double x){
            return 3*x*x-1;
        }
        public static double secondDeriv(double x){
        return 6*x;
        }
        public static int NSD(int a, int b) {
            while (a != b) {
                if (a > b){
                    a = a - b;
                }
                else{
                    b = b - a;
                }
            }
            return a;
        }

    }