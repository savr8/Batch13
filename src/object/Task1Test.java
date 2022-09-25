package object;

import java.util.Arrays;

public class Task1Test {

    public static void main(String[] args) {

        char[] array1 =Task .letterOfString("Case");
        System.out.println(Arrays.toString(array1));
        System.out.println();
        System.out.println(Arrays.toString(Task.letterOfString("Phone")));
        //creating String Array to pass in to method as parameter
        String []items ={"Phone","Case","EarPhone"};
        int count= Task.letterOfString(items);
        System.out.println(count+" << elements in the diving array");
    }
}
