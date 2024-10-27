public class Main {
    public static void main(String[] args) {
        Works works = new Works();
        Teacher teacher = new Teacher(works);
        Student student = new Student(works);
        student.start();
        teacher.start();





        /*
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        producer.start();
        consumer.start();
         */
    }
}