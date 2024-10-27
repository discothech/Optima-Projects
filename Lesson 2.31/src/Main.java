public class Main {
    public static void main(String[] args) {
        Cylindr cylindr = new Cylindr(2, 3);
        cylindr.ShowName();
        System.out.println("Cylindr volume equals = "+cylindr.Volume());

        Cone cone = new Cone(2, 3);
        cone.ShowName();
        System.out.println("Cone volume equals = "+cone.Volume());

        Ball ball = new Ball(2);
        cone.ShowName();
        System.out.println("Ball volume equals = "+ball.Volume());


        /*
        Circle circle = new Circle(4);
        circle.ShowName();
        System.out.println("Circle Area equals = "+circle.Area());

        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.ShowName();
        System.out.println("Rectangle Area equals = "+rectangle.Area());

         */
    }
}