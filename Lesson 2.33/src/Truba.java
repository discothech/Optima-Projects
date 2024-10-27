public class Truba implements Instrument{
        double diametr;
        Truba(double diametr){
            this.diametr = diametr;
        }
        public void play(){
            System.out.println("Play instrument truba");
            System.out.println("diametr = "+diametr);
        }
    }
