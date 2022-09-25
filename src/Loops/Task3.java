package Loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        perfect number->6 divisors of 1,2,3==>1+2+3=6

        10->1,2,5
        20->1,2,4,5,10
        ask user to give a positive integer and check  if the number is perfect number or not


         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to check if it is perfect number or not");
        int num = scanner.nextInt();

        int sum = 0;

        for (int divisor = 1; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                sum = sum + divisor;
                System.out.println(divisor);
            }
        }
        if(num==sum){

            System.out.println(num+" is a perfect number");
        }else{
            System.out.println(num+"is NOT a perfect number");
        }
    }
}
