public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.del();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);
        myQueue.del();
        try{
            div(12,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static double div (double a, double b) throws Exception{
        if (b==0) throw new Exception("Not allowed to divide by 0");
        return a/b;
    }
}