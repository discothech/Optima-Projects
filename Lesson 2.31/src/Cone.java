public class Cone extends ThreeDimentionalSolid {
    public int r;
    public int h;
    Cone(int r, int h){
        this.r=r;
        this.h=h;
        name = "cone";
    }
    @Override
    void ShowName(){
        System.out.println(GetName());
    }
    @Override
    double Volume(){
        return (pi*r*r*h)/3;
    }
}
