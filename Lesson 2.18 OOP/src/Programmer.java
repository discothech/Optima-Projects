public class Programmer extends Person{
    String specialization = "C++ Developer";
    @Override
    void printInfo(){
        System.out.println(name+"  "+surname+"  "+specialization);
    }
}
