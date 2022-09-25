package object;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {

        String str = new String();
        Scanner scanner = new Scanner(System.in);
        Animal cat = new Animal();
        System.out.println(cat.colour);//default null
        cat.colour = "White";
        System.out.println(cat.colour);//white

        System.out.println(cat.age);//default
        cat.age = 3;
        System.out.println(cat.age);//3
        System.out.println(cat.bread);
        System.out.println(cat.gender);
        cat.gender = 'F';
        cat.bread = "Scottish";
        System.out.println(cat.bread);//scottish
        System.out.println(cat.gender);//F
        //create a dog object and assign/print all instance variables for dog

        Animal dog = new Animal();
        dog.gender = 'M';
        dog.colour = "Black";
        dog.bread = "Pitbull";
        dog.age = 4;
        System.out.println(dog.gender);
        System.out.println(dog.colour);
        System.out.println(dog.bread);
        System.out.println(dog.age);
        System.out.println(dog.colour.concat(dog.bread).equalsIgnoreCase("blackPitbull"));//boolean
        //example for array with object
        Animal[] animals = {cat, dog};
        //show the colour cat and animal this animal array
        System.out.println(animals[0].colour);//white
        System.out.println(animals[1].colour);//black
       //========================================
        for (Animal pet : animals )
        {
            System.out.println(pet.colour);
            System.out.println(pet.age);
            System.out.println(pet.gender);
            System.out.println(pet.bread);
            System.out.println(">>>>>>next pet<<<<<<<<<<");
        }


    }
}
