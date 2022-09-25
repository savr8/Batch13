package object;

import java.util.Arrays;

public class Task {
    /**
     * Create a task class under object package
     * create a method that will return an array for every letter of given String
     * parameter of the method will be string
     * <p>
     * Ex: "Phone" --> output --> [P, h, o, n, e]
     */
    //Overload Method:
    //count and return number of elements from array
    //
    //
    public static char[] letterOfString(String text) {
        char[] letters = new char[text.length()];
        for (int index = 0; index < text.length(); index++) {
            letters[index] = text.charAt(index);
        }
        return letters;
    }

    public static int letterOfString(String []items) {


        return items.length;
    }

    public static void main(String[] args) {
        char[] array1 = letterOfString("Case");
        System.out.println(Arrays.toString(array1));
        System.out.println();
        System.out.println(Arrays.toString(letterOfString("Phone")));
       //creating String Array to pass in to method as parameter
        String []items ={"Phone","Case","EarPhone"};
       int count= letterOfString(items);
        System.out.println(count+" << elements in the diving array");
    }
}