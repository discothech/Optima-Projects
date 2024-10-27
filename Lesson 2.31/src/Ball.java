public class Ball extends ThreeDimentionalSolid{
    public int r;
    Ball(int r){
        this.r=r;
        name = "ball";
    }
    @Override
    void ShowName(){
        System.out.println(GetName());
    }
    @Override
    double Volume(){
        return 4*(pi*r*r*r)/3;
    }
}
