public abstract class Shape {
    protected String name = "";
    final double pi = 3.14;
    abstract void ShowName();
    abstract double Area();
    String GetName(){
        return name;
    }
}
