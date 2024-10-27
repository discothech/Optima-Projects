import java.io.Serializable;

public class Country implements Serializable {
    String name;
    Double square;
    int population;
    Country(String name, double square, int population){
        this.name=name;
        this.square=square;
        this.population=population;
    }
    public String toString(){
        return "name: "+name+", S = "+square+", population = "+population;
    }
}