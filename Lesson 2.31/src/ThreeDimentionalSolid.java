public abstract class ThreeDimentionalSolid {
    protected String name = "";
    final double pi = 3.14;
    abstract void ShowName();
    abstract double Volume();
    String GetName(){
        return name;
    }
}
