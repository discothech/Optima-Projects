public class Baraban implements Instrument{
    double size;
    Baraban(double size){
        this.size=size;
    }

    public void play(){
        System.out.println("Play instrument baraban");
        System.out.println("size = "+size);
    }
}
