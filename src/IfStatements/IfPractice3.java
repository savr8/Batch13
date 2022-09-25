package IfStatements;

import java.util.Scanner;

public class IfPractice3 {
    public static void main(String[] args) {
        /*
        ask user enter name of the day Monday- Sunday
        print  'It is day 1'
        'it is day 2'
        when user enters any other day then expected
        print 'there is no matching day for your entry'

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name of the day");
       String day = scanner.nextLine();
        if(day.equalsIgnoreCase("monday"))
        {
            System.out.println("it is day1");
        }
        if(day.equalsIgnoreCase("tuesday"))
        {
            System.out.println("it is day2");
        }
        if(day.equalsIgnoreCase("wednesday"))
        {
            System.out.println("it is day3");
        }
        if(day.equalsIgnoreCase("thursday"))
        {
            System.out.println("it is day4");
        }
        if(day.equalsIgnoreCase("friday"))
        {
            System.out.println("it is day5");
        }
        if(day.equalsIgnoreCase("saturday"))
        {
            System.out.println("it is day6");
        }
        if(day.equalsIgnoreCase("sunday"))
        {
            System.out.println("it is day7");
        }
        if(!day.equalsIgnoreCase("monday")&&!day.equalsIgnoreCase("tuesday")&&!day.equalsIgnoreCase("wednesday")
        &&!day.equalsIgnoreCase("thusday")&&!day.equalsIgnoreCase("friday")&&!day.equalsIgnoreCase("saturday")&&!!day.equalsIgnoreCase("sunday"))
        {
            System.out.println("there is no matching day for your entry "+day);
        }
        /*
        if the first letter of the entered day is:
        M or m --> t is Monday
        T or t -->it is Tuesday or Thursday
        ...solve it by using char/string
         */

        if (day.startsWith("M")||day.startsWith("m"))
        {
            System.out.println("It is Monday ******* string solution ");
        }

       char firstLetter = day.charAt(0);
        if (firstLetter =='M'|| firstLetter=='m'){
            System.out.println("It is Monday--->Char solution");
        }

        if (firstLetter =='T'|| firstLetter=='t'){
            System.out.println("It is Tuesday or Thursday--->Char solution");
        }

        if (firstLetter =='W'|| firstLetter=='w'){
            System.out.println("It is Wednesday--->Char solution");
        }
        if (firstLetter =='F'|| firstLetter=='f'){
            System.out.println("It is Friday--->Char solution");
        }
        if (firstLetter =='S'|| firstLetter=='s'){
            System.out.println("It is Saturday or Sunday--->Char solution");
        }
    }
}
