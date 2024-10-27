public class Producer extends Thread{
    Store store;
    Producer(Store store){
        this.store = store;
    }
    public void run(){
        for (int i = 0; i<=5; i++)
        {
            store.put();
        }
    }
}