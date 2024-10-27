public class Main {
    public static void main(String[] args) {
        Point A = new Point(-2,-1);
        Point B = new Point(2,4);
        Point C = new Point(4,1);
        Triangle t = new Triangle(A, B, C);
        System.out.println("Perymetr of triangle is " +t.P());
        System.out.println("Square of triangle is " +t.S());

    }
}