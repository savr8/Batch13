package Loops;

import java.util.Random;
import java.util.Scanner;

public class HeadTailTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String yesNo;
        do {
            int number = random.nextInt(2);
            System.out.println("Game is started,MAKE a GUESS!HEAD/TAIL");
            String userGuess = scanner.next();
            String flip = number == 0 ? "Head" : "Tail";

            if (userGuess.equalsIgnoreCase(flip)) {
                System.out.println("You are lucky,it is your day today");

            } else {
                System.out.println("Sorry,that was not your day today");
            }

            System.out.println("Do you want to play again?Yes/No");
            yesNo = scanner.next();
        } while (yesNo.equalsIgnoreCase("yes"));

        System.out.println("Its Ok,SEE you Next Time!");
    }
}

