public class Gitara implements Instrument{
    int amountStr;
    Gitara(int amountStr){
        this.amountStr=amountStr;
    }
    public void play(){
        System.out.println("Play instrument gitara");
        System.out.println("kilkist strun = "+amountStr);
    }
}

