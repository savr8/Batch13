package IfStatements;

import java.util.Scanner;

public class ElseIfTask {
    public static void main(String[] args) {
        /*
        ask user to give an integer number
        if number is greater than zero -> print your number is positive number
        if the number is less than zero ->print number is negative number
        otherwise ->print ->your number ZERO
         */
        Scanner input = new Scanner(System.in);

        System.out.println("enter integer number");

        int number = input.nextInt();
        if(number>0) {
            System.out.println("your number is positive number");
        } else if (number<0) {
            System.out.println("number is negative number");
        }
        else{
            System.out.println("your number ZERO");
        }
    }
}
