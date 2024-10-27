public class Circle extends Shape {
    public double r;
    Circle(double r){
        this.r = r;
        name = "circle";
    }
    @Override
    void ShowName(){
        System.out.println(GetName());
    }
    @Override
    double Area(){
        return pi*r*r;
    }
}