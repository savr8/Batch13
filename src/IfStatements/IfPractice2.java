package IfStatements;

import java.util.Scanner;

public class IfPractice2
{
    public static void main(String[] args)
    {
        /*get number between 1 and 7 from user
        if the number is:
        1--> "It is Monday"
        2-->"It is Tuesday"
        ...
        7-->"It is Sunday"
        */
        Scanner input = new Scanner(System.in);
        System.out.println("enter number between 1 and 7 as integer");
        int userNumber = input.nextInt();

        if(userNumber==1){
            System.out.println("Monday");
        }
        if(userNumber==2){
            System.out.println("Tuesday");
        }
        if(userNumber==3){
            System.out.println("Wednesday");
        }
        if(userNumber==4){
            System.out.println("Thursday");
        }
        if(userNumber==5){
            System.out.println("Fridayday");
        }
        if(userNumber==6){
            System.out.println("Saturday");
        }
        if(userNumber==7){
            System.out.println("Sunday");
        }
        //There is no Day for that entry >>21
        if(userNumber<1||userNumber>7){
            System.out.println("There is no Day for that entry");
        }
    }
}
