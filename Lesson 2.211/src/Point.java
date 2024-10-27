public class Point {
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        x=0;
        y=0;
    }
    public void print(){
        System.out.println("x = "+x+" y = "+y);
    }
/*
    public int quarter(){
        if (x>0 && y>0){
            //System.out.println("The point is in I Quarter");
            return 1;
        }
        else if (x<0 && y>0){
            //System.out.println("The point is in II Quarter");
            return 2;
        }
        else if (x<0 && y<0){
            //System.out.println("The point is in III Quarter");
            return 3;
        }
        else if (x>0 && y<0){
            // System.out.println("The point is in IV Quarter");//
            return 4;
        }
        return -1;
    }

 */
    public double distance(Point p){
        double d = Math.sqrt((p.x-this.x)*(p.x-this.x)*(p.y-this.y)*(p.y-this.y));
        return d;
    }

}
