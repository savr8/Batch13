package arrayList;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1=new Computer("Apple","Pro",11,1000);
        Computer c2 =new Computer("HP","envy",15,1500);
        Computer c3 = new Computer("Lenovo","ThinkPad",11,450);
        Computer c4 = new Computer("Apple","Air",16,1200);

        ArrayList<Computer>devices = new ArrayList<>();
        devices.add(c1);
        devices.add(c2);
        devices.add(c3);
        devices.add(c4);
        System.out.println(devices);
        priceChecker(devices);
      ArrayList<Double>devicesPrices =  findSum(devices);
        System.out.println(devicesPrices);

    }
    public static void priceChecker(ArrayList<Computer>computers){

        for(Computer machine:computers){
            if(machine.price<500){
                System.out.println("Price of this "+machine.brand+" is less than $500");
            }

        }

    }

    //create a method that will take an ArrayList as parameter
    //this method will calculate total prices of the computers
   //return devices prices in a separateList

    public static ArrayList<Double> findSum(ArrayList<Computer>computers){
        double sum =0;
        ArrayList<Double> prices = new ArrayList<>();

        for(Computer item :computers){
            prices.add(item.price);
            sum=sum+ item.price;
        }
        System.out.println("Total price of Computers is :"+sum);
    return prices;
    }


}
