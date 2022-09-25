package Loops;

import java.util.Scanner;

public class WhileLoop5 {
    /*
    ask user to give a integer number
    create multiplication table for that number up to 10s
    input data >5
    5*1=5
    5*2=10
    .....
    5*9=45
    5*10=50
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter integer number");
        int number1 = input.nextInt();
        int number2 = 1;

        while (number2 <= 10) {
            int result = number1 * number2;
            System.out.println(number1 + "*" + number2 + "=" + result);
            number2++;
        }

    }
}