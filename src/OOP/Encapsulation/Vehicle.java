package OOP.Encapsulation;

public class Vehicle {
    protected  String model;
    int year;
    public String brand;

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    /*
          Methods:
        move(); --> vehicle is moving
        stop(); --> return true, vehicle is stopping
        protected start(); --> return true, vehicle is starting
        default accelerate(); --> return Object
         */
    void move(){
        System.out.println("vehicle is moving");
    }
    boolean stop(){
        System.out.println("vehicle is stopping");
        return true;

    }
    protected boolean start(){
        System.out.println("vehicle is starting");
        return true;
    }
    Object accelerate(){
        System.out.println("Getting faster");
        return  new Object();
    }
}
