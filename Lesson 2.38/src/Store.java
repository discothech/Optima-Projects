public class Store extends Thread{
    private int product = 0;
    public synchronized void get(){
        while (product<1){
            try{
                wait();
            }
            catch (InterruptedException e){
            }
        }
        product--;
        System.out.println("We have get one product.");
        System.out.println("We have "+product+" products.");
        notify();
    }
    public synchronized void put(){
        while (product >=3){
            try {
                wait();
            }
            catch (InterruptedException e){
            }
        }
        product++;
        System.out.println("One product added to the store");
        System.out.println("We have "+product+" products");
        notify();
    }
}