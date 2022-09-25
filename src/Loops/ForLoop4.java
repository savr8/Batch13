package Loops;

public class ForLoop4 {
    public static void main(String[] args) {
        /*
        Reverse the given string and print the reversed version as a string
        String str = "Phone";->enohP
         */

        String str = "Phone";
        String reversed = "" ;
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}
