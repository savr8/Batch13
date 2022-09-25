package OOP.Encapsulation;

public class City {
    private String name;
    private long population;
    private String state;
    String language;
    static  int zipCode;

    public void setName(String name){
      this.name=name;
    }

    public void setPopulation(long population1){
        this.population=population;
    }

    public void setState(String state){
        this.state=state;
    }
    public String getName(){
      return name;
    }

    public long getPopulation() {
        return population;
    }

    public static void setZipCode(int zipCode) {
        City.zipCode = zipCode;
    }

    public String getState(){
        return state;
}
}
