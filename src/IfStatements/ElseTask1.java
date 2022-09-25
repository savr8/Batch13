package IfStatements;

import java.util.Scanner;

public class ElseTask1 {
    public static void main(String[] args) {
        /*
        sak user if he has driver license
        -print you are great
        -otherwise print -->please visit dmv location
         */
        Scanner input = new Scanner(System.in);

        System.out.println("do you have a driver license?Yes/No");

       String data = input.nextLine() ;
        if (data.equalsIgnoreCase("yes")){
            System.out.println("you are great");
        }
        else {
            System.out.println("please visit dmv location");
        }
    }
}
