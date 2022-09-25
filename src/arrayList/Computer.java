package arrayList;

import java.util.ArrayList;

public class Computer {
    /*
    1-create a Computer class with following instance fields
    brand,model,screenSize,price
    2- override -->toString method to showComputer features
    3- Create a test class;
    create an arraylist and more 4 computers
    4 create a method in this test class to find out computer with price than $500 and show that computer
      */

        String brand,model;
        int screenSize;
        double price;

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", price=" + price +
                '}';
    }
    public Computer(String brand,String model,int screenSize,double price){
        this.brand=brand;
        this.model=model;
        this.screenSize=screenSize;
        this.price=price;
    }


}
