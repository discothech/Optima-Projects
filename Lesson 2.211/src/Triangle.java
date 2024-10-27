public class Triangle {
    Point A;
    Point B;
    Point C;

    Triangle (Point A, Point B, Point C){
        double AB = A.distance(B);
        double BC = B.distance(C);
        double AC = A.distance(C);
        if (AB>BC+AC && BC>AB+AC && AC>AB+BC){
            System.out.println("Triangle is incorrect!");
        }
        else {
            this.A = A;
            this.B = B;
            this.C = C;
        }
    }

    Triangle (int xa, int ya, int xb, int yb, int xc, int yc){
        Point A = new Point(xa, ya);
        Point B = new Point(xb, yb);
        Point C = new Point(xc, yc);
        double AB = A.distance(B);
        double BC = B.distance(C);
        double AC = A.distance(C);
        if (AB>BC+AC || BC>AB+AC || AC>AB+BC){
            System.out.println("Triangle is incorrect!");
        }
        else {
            this.A=A;
            this.B=B;
            this.C=C;
        }
    }
    public double P(){
        double AB = A.distance(B);
        double BC = B.distance(C);
        double AC = A.distance(C);
        double P = AB+BC+AC;
        return P;
    }
    public double S(){
        double AB = A.distance(B);
        double BC = B.distance(C);
        double AC = A.distance(C);
        double p = P()/2;
        double S = Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
        return S;
    }
}