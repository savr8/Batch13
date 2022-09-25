package Loops;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        /*
        ask user to give a positive integer number
        create a star tree for that given number
        input number : 5
        output:
        *
        **
        ***
        ****
        *****
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer number");
        int number = scanner.nextInt();

        String star = "*";

        do {

            System.out.println(star);

        star += "*";//**,
        number--;
    }while(number>0);
        System.out.println(star);//
}
}
