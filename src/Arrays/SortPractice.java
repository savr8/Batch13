package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class SortPractice {
    public static void main(String[] args) {

        int [] numbers ={ 4,3,7,19,23,440,1,100 };

        //sort
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        //after sort
        System.out.println(Arrays.toString(numbers));
        //find largest?find smallest

        System.out.println(numbers[0]);//smallest
        System.out.println(numbers[numbers.length-1]);//largest

        String[] snacks = {"Chips","fries","cookies","Fruit"};
        System.out.println(Arrays.toString(snacks));

        //sort
        Arrays.sort(snacks);
        System.out.println(Arrays.toString(snacks));

        //print every single letter UpperCase
        System.out.println(Arrays.toString(snacks).toUpperCase());
        for (int i=0;i<snacks.length;i++){
            snacks[i]=snacks[i].toUpperCase(Locale.ROOT);
            System.out.println(snacks[i].toUpperCase());
        }
        Arrays.sort(snacks);

    }
}
