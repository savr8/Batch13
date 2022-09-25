package IfStatements;

import java.util.Scanner;

public class ElseIfTask2 {
    public static void main(String[] args) {

        /*
         -take 3 test scores from user between 0 - 100
        if average of 3 test scores of student is falling in to following ranges
        average is 100 - 90 --> your letter grade is A
         average is 89 - 80 --> your letter grade is B
          average is 79 - 70 --> your letter grade is C
           average is 69 - 60 --> your letter grade is D
           --> 'we have space for next semester'
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first test score");
        double first = scanner.nextDouble();
        System.out.println("enter your second test score");
        double second = scanner.nextDouble();
        System.out.println("enter your third test score");
        double third = scanner.nextDouble();
        // finding average of test scores
        double ave = (first+second+third)/3;
        if ( ave <=100 && ave >=90){
            System.out.println("your letter grade is A");
        }else if (ave >= 80 && ave <=89){
            System.out.println("your letter grade is B");
        }else if( ave >= 70 && ave <=79){
            System.out.println("your letter grade is C");
        }else if(ave >= 60 && ave <=69){
            System.out.println("your letter grade is D");
        }else if(ave >100 || ave < 0){
            System.out.println("your average is out of range");
        }
        else {
            System.out.println("your score is failing");
        }
    }

    }

