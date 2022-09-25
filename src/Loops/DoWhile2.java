package Loops;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        /*ask user to give 2 positive integer numbers
        -find the sum of numbers in the range
        input :5 9 ->5+6+7+8+9=35
        output:The sum of numbers between..firstNum..and..secondNum..is..sum
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your first positive integer numbers");

        int firstN = scanner.nextInt();
        System.out.println("Please enter your second number which should be more than first entry");
        int secondN=scanner.nextInt();
        int sum =0;
        do {
            sum =sum+firstN;//sum+=firstN;
            System.out.println("The sum of numbers between "+ firstN+" and "+ secondN+" is "+sum);
            firstN++;
        }while (firstN<=secondN);
        System.out.println(sum);
    }
}
