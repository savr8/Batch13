package IfStatements;

import java.util.Scanner;

public class ElseTask3 {
    public static void main(String[] args) {

        /*
        ask user to enter their zip code as integer
        check if user's zipcode is an Even number zipcode-->0,2,4,6,8,-->even number
        otherwise -->print>>you are living in on 000 number zipcode
         */

        Scanner input = new Scanner(System.in);

        System.out.println("whts your zip code?");

        int zip = input.nextInt();
        if (zip%2==0){
            System.out.println("You are living in an EVEN number zipcode"+zip);

        }
        else{
            System.out.println("You are living in Odd zipcode"+zip);
        }

    }
}
