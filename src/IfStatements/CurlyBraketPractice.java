package IfStatements;

public class CurlyBraketPractice {
    public static void main(String[] args) {


        int number = 123;
//without curly brackets,if statement will execute all following codes
        if (number == 123)
            System.out.println("First statement");
        System.out.println("Second statement");
        System.out.println(56 - 10);

        System.out.println("==============");
//without curly brackts,if statement will skip first piece of code when boolean condition is FALSE
        if (number > 500)
            System.out.println("Hi this is first statement");
        System.out.println("Hello this is second statement");
        System.out.println("I am learning If Blocks");

        if (8 != 8) {
            System.out.println("8 should be equal to 8");
        }

    }
}
