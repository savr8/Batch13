package IfStatements;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {

        /*
        when your purchase is over $100 you will get %20 discount
        otherwise you will get only %5 discount

        -calculate discount for each case and show
        -calculate final amount payments and show
         */

        Scanner input = new Scanner(System.in);

        System.out.println("how much money did you spend?");

        Double data = input.nextDouble();

        if (data > 100) {
            System.out.println("your discount amount is "+ (data *0.2 ));
            System.out.println("you will pay "+(data*0.80));
        } else {
            System.out.println("your discount amount is "+ (data *0.05));
            System.out.println("you will pay "+(data*0.95));

        }

    }}