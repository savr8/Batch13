package IfStatements;

public class NestedPractice1 {
    public static void main(String[] args) {
        /*
        passport,visa,tickets
         */
        boolean passport = false;
        boolean visa = true;
        boolean ticket = true;

        if (passport == true) {
            System.out.println("You have passport,try for visa");
            if (visa == true) {
                System.out.println("You have visa,can buy a ticket");
                if (ticket == true) {
                    System.out.println("Good news,you can now fly to your destination");
                } else {
                    System.out.println("You need to buy a ticket");
                }
            } else {
                System.out.println("You need to get a visa");
            }


        } else {
            System.out.println("You need to get a passport");
        }
    }
}
