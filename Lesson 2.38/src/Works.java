public class Works {
    private int numberOfWorks = 0;
    public synchronized void put(){
        while (numberOfWorks>=5){
            try {
                wait();
            }
           catch (InterruptedException e){}
        }
        numberOfWorks++;
        System.out.println("Student has put his work.");
        System.out.println("Number of works that are put on the table is: "+numberOfWorks);
        notify();
    }
    public synchronized void get(){
        while (numberOfWorks<1){
            try {
                wait();
            }
            catch (InterruptedException e){}
        }
        numberOfWorks--;
        System.out.println("Teacher has has checked a work.");
        System.out.println("There are still: "+numberOfWorks+" works on the table");
        notify();
    }

}
