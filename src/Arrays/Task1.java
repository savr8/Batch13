package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // if the name that user enters has 5 or more letters store that name in to longNames array
        // if the name has less than 5 letters, store that name in to 'shortNames' array
        // print out shortNames and longNames arrays to show
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do you want to store? please enter");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[numberOfNames];
        String[] longNames = new String[numberOfNames];
        String[] shortNames = new String[numberOfNames];
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println("Please enter " + (i + 1) + ". name");
            //  names[i] = scanner.nextLine();
            String name = scanner.nextLine();
            names[i] = name;
            if (name.length() >= 5) {
                longNames[i] = name;
            } else {
                shortNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));
        System.out.println(Arrays.toString(names));
//        for (int i = 0; i < numberOfNames; i++) {
//
//
//            System.out.println(names[i]);
//        }
    }
}