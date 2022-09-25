package IfStatements;

import java.util.Scanner;

public class NestedTask1 {
    public static void main(String[] args) {
        /*
        ask user for their city name
        -if the city name is Chicago
        -ask user for their school/course name
         -if course name techtorial
         ->print "you are lucky
         -tell user to come to chicago and visit techtorial
         -if the school name is not techtorial
         -tell user to come and visit techtorial

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your city?");
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase("Chicago")) {
            //when the city name is chicago
            System.out.println("Which school yuo are attending?");
            String school = scanner.nextLine();
            if (school.equalsIgnoreCase("Techtorial")) {
                //when school is techtorial
                System.out.println("you are lucky to be in  B13");

            } else {
                //when school is not techtorial
                System.out.println("Visit Techtorial,since you in Chicago");
            }
        } else {
            //when the city is not chicago
            System.out.println("Come to Chicago and visit techtorial" +
                    "");
        }
    }
}
