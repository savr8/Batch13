package Loops;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        /*
        ask user to enter an integer number and find the divisors of the given number
        10-->1,2,5,10
        15-->1,3,5,15
        12-->1,2,3,4,6,12
        %,loop,scanner,if,else,condition,update condition
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = input.nextInt();
        int divisor = 1;
        while (divisor <= number) {
            if (number % divisor == 0) {
                System.out.println(divisor + " can divide " + number + " evenly");

            } else {
                System.out.println(divisor);
            }
            divisor++;
        }

    }
}
