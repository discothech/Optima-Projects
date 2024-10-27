import java.io.Serializable;

public class City implements Serializable {
    String name;
    Country country;
    int population;
    City(String name, Country country, int population){
        this.name=name;
        this.country=country;
        this.population=population;
    }
    public String toString(){
        return "name: "+name+", \nCountry: "+country.toString()+"\npopulation = "+population;
    }
}
