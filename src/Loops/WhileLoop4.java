package Loops;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
        /*
        get 2 positive  numbers from user
        and printout number between those given numbers
        given numbers >>> 1-9
        print>>> 1,2,3...9
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 positive numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();


        if (number1 <= number2) {
            while (number1 < number2) {
                System.out.println(number1);
                number1++;
            }
        } else {
            while (number2 <= number1) {
                ;
                System.out.println(number2);

                number2++;
            }
        }
    }
}



