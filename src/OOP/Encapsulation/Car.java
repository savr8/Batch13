package OOP.Encapsulation;

public class Car extends Vehicle{

    /*
    model;
    engineType;
     */
    String model;
    String engineType;
    public Car(){

        super("Corolla",2000,"Toyota");//practice to use super method
    }
    @Override
    public void move(){
        System.out.println("Car is moving");
    }

    Integer accelerate(){
        super.model="Lexus";//practice how to super keyword
        return 23;
    }

}
