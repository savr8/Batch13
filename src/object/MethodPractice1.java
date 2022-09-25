package object;

import java.util.Scanner;

public class MethodPractice1 {

    public static void main(String[] args) {
        MethodPractice1 calculator = new MethodPractice1();
        calculator.ageCalc(2006);
        calculator.ageCalc(1990,"David");
        calculator.ageCalc(1990,"Sam",2000);
    }
    /*
        overload this ageCalc method
        get current year from user y using scanner, use the current year in your calc
        ..Alex.. your at the age of ...age.. in ...2022..
      */
    public String ageCalc(int birthYear, String name,int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is current year?");
        currentYear = scanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println(name+ " your at the age of "+age + " in "+currentYear);
        return name+ " your age is "+age;
    }
    /*
        create a method that will calculate age of a person
        it will return the age as int
        it will print the age
        *create main method in the same class and test your code
        2022 - 2000 = 22
 */
    public int ageCalc( int birthYear){
        int age  = 2022 - birthYear;
        System.out.println(age);
        return age;
    }
    // overload this ageCalc method to say:
    // ..Alex.. your age is ...age..
    public String ageCalc(int birthYear, String name){
        int age = 2022 - birthYear;
        System.out.println(name+ " your age is "+age);
        return name+ " your age is "+age;
    }


}
