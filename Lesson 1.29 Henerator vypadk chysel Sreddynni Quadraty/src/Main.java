public class Main {
    public static void main(String[] args) {
    double a = halfProduct(12315, 98561);
    System.out.println(a);

    }
    public static double halfProduct(int R0, int R1){
        int n;
        if(R0>R1){
            String r0str = Integer.toString(R0);
            n=r0str.length();
        }
        else {
            String r1Str = Integer.toString(R1);
            n=r1Str.length();
        }
        System.out.println("Number of symbols is "+n);
        int R2 = R0*R1;
        String r2Str = Integer.toString(R2);
        System.out.println(r2Str);
        while (r2Str.length()!=2*n){
            r2Str = "0"+r2Str;
        }
        r2Str=r2Str.substring((n+1)/2, 2*n-n/2);
        System.out.println(r2Str);
        r2Str="0."+r2Str;
        double random = Double.parseDouble(r2Str);
        return random;
    }
}