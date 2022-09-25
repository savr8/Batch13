package Loops;

public class ForLoop3 {
    public static void main(String[] args) {
        /*
        String str = "Today is the best day to practice for loop"
        print out only letter 't's from the string by using for loop

count number of 'o's from this string
-->" ... 'o'in this string"
         */

        String str = "Today is the best day to practice for loop";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 't') {

                System.out.println(str.charAt(i));
            }
        }
        System.out.println("=====================");
        int count = 0;
        for (int i = 0; i <= str.length()-1; i++) {

            if (str.charAt(i) == 'o') {
                count++;

            }
        }
        System.out.println("There are " + count + " from this string");
    }
}
