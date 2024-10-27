public class Car implements Comparable{
    private String marka;
    private String number;
    private int year;
    private double probih;
    Car(String marka, String number, int year, double probih){
        this.marka=marka;
        this.number=number;
        this.year=year;
        this.probih=probih;
    }
    Car(String number, int year){
        this.number=number;
        this.year=year;
    }
    public String toString(){
        return String.format("%s %d", number, year);
    }
    public int compareTo(Object o){
        Car temp = (Car)o;
        int rez = Integer.compare(year, temp.year);
        return rez;
    }
}
