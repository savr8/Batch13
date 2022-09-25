package object;

public class Animal {
    //instance variables,they are out of any block/scope,in the class,they belong to object

    int age;

    String bread;

    char gender;

    String colour;
    int energy = 100;
    String name;

    public void sleep() {
        energy=100;
        System.out.println(name + " is sleeping");
    }

    //create a run method print Animal is running
    //use that method creating on eagle object in the test class
    public void run() {
        energy=energy-10;
        System.out.println(name + " is running");
    }
    /*
    create a method which print out information of the animal
    -name the method as "print info"
     */

    public void printInfo(){

        System.out.println("Name is :"+name+"\nAge is:"+age +"Genderis:"+gender+"\nBread"+bread+"Colouris:"+colour+"\nEnergy is:"+energy);
    }


}
