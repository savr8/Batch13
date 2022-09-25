package Loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        palindrome->1234321,121,efe,anna
        get a string from a user and check if the string palindrome or not

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string to check if it is palindrome ");
        String str = scanner.nextLine();
        //original entry ANNA after reversed -->ANNA -->original reversed
        //ANNA
        //str.charAt(str.length()-1);last index
        String reversed = "";//
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);//

        }
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + "- Palindrome");
        } else {
            System.out.println(str + " -Not Palindrome");
        }
    }
}
