public class Main {
    public static void main(String[] args) {
        System.out.println(minValue(-4, -9));
        transformation(123);
    }
    public static int minValue(int a, int b)
    {
        int x = sign(a-b);//a>b=>0 a<b =>1
        int y = x^1;
        return a*x+b*y;
    }
    static int sign(int dif){
        return ((dif&(1<<31))>>31)*(-1);
    }
    public static void transformation(int a){
        String str = Integer.toString(a);
        int n = str.length();
        switch (n)
        {
            case 1:{}
                break;
            case 2:{}
                break;
        }
        int b = a/100;
        int c = a%100;
        int d = a%100%10;
        System.out.println("hundreds "+b);
        System.out.println(" ");
        System.out.println("dozens "+c);
        System.out.println(" ");
        System.out.println("units "+d);
    }
}