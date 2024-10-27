public class Cylindr extends ThreeDimentionalSolid {
    public int r;
    public int h;
    Cylindr(int r, int h){
        this.r=r;
        this.h=h;
        name = "cylindr";
    }
    @Override
    void ShowName(){
        System.out.println(GetName());
    }
    @Override
    double Volume(){
        return pi*r*r*h;
    }
}
