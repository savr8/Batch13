package Loops;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        ask user to get positive number which is less than 100
        print out the number which are divisible by 5
        from 1 to that given number
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Plesase enter positive number less than 100");
        int userNumber = scanner.nextInt();
        int number =1;
        while (userNumber>=number){

            if (number%5==0){
                System.out.println(number);

            }number++;
        }
        Random random = new Random();

      int num =  random.nextInt(2);
        System.out.println(num);


    }
}
