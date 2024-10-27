public class Car {
    String carClass;
    Engine engine;
    String marka;
    String driver;

    public void start(){
        System.out.println("Go!");
    }
    public void stop(){
        System.out.println("Stop!");
    }
    public void turnRight(){
        System.out.println("Turn Right!");
    }
    public void turnLeft(){
        System.out.println("Turn Left!");
    }
    public String toString(){
        return "Class of auto: "+carClass+"Engine Type: "+engine.toString()+"Model: "+marka+" Driver: "+driver;
    }
}
