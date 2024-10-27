public class Student extends Thread {
    Works works;

    Student(Works works) {
        this.works = works;
    }

    public void run() {
        for (int i = 1; i <= 25; i++) {
            works.put();
        }
    }
}