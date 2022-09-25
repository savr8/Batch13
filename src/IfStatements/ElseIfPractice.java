package IfStatements;

public class ElseIfPractice {
    public static void main(String[] args) {
        /*
        pick the number between 0-15
        if the number between 0 and 5-->your number is in the range of 0-5
        if your number is btw 5 and10->your number is in the range of 6-10
        if the number is btw 10 and 15->your number is in the range of 10-15
         */
        int number = 23;

        if (number >= 0 && number <= 5) {
            System.out.println("your number is in the range of 0-5");
        } else if (number >= 6 && number <= 10) {
            System.out.println("your number is in the range of 6-10");
        } else if (number >= 11 && number < 16) {
            System.out.println("your number is in the range of 10-15");
        } else {
            System.out.println("This is out of range");
        }
    }
}
