package String;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {
        String str = "I want to solve this question in two minutes";

        //get every word as single element from this string


        System.out.println(Arrays.toString(str.split(" ")));

        String[] words = str.split(" ");//String all the str,print as whole string array

        System.out.println(Arrays.toString(words));//Print as whole array

        for (int i = 0; i < words.length; i++) {//traditional for loop one by one

            System.out.println(words[i]);
        }
        System.out.println("=================");

        for (String c : words) {//for each loop one by one

            System.out.println(c);
        }
    }
}
