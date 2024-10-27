public class Teacher extends Thread{
    Works works;
    Teacher(Works works){
        this.works = works;
    }
    public void run(){
        for (int i = 1; i <=25 ; i++) {
            works.get();
        }
    }
}
