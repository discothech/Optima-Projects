public class Engine {
    int power;
    String company;
    Engine(int power, String company){
        this.power=power;
        this.company=company;
    }
    public String toString(){
        return "power: "+power+" company:"+company;
    }
}
