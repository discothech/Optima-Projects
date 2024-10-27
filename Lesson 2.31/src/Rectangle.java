public class Rectangle extends Shape {
    public int a;
    public int b;
    Rectangle(int a, int b){
        this.a=a;
        this.b=b;
        name = "rectangle";
    }
    @Override
    void ShowName(){
        System.out.println(GetName());
    }
    @Override
    double Area(){
        return a*b;
    }
}
