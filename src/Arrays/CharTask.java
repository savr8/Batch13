package Arrays;

import java.util.Arrays;

public class CharTask {
    public static void main(String[] args) {
        /*
        {'B','Y','6','w','3','&','!','d'}
        -create an array to store above values
        -print numbers only
         */

        char[] array = {'B', 'Y', '6', 'w', '3', '&', '!', 'd'};

        for (char ch : array) {
            if (ch >= '0' && ch <= '9') {
                System.out.println(ch);
            }
        }

        System.out.println("===================");

        for (char ch :array){

            if(Character.isDigit(ch)){
                System.out.println(ch);
            } if (Character.isAlphabetic(ch)) {
                System.out.println(ch);
            }
            if(!Character.isAlphabetic(ch)&&!Character.isDigit(ch)){
                System.out.println(ch);
            }
        }

    }
}
