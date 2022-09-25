package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindingDuplicates {
    public static void main(String[] args) {
        //element repeating elements from array
        String[] array1 = {"a", "b", "c", "a", "d", "c", "k", "c"};
        System.out.println(array1);
        //idea 1 :convert array to List and then convert List to Set
        List<String> list = Arrays.asList(array1);

        System.out.println(list);
        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);
        System.out.println("+++++++++++++++++++++++++++++++");
        //=============idea 2:==============
        HashSet<String> set2 = new HashSet<>();
        for (String word : array1) {
            set2.add(word);

        }
        System.out.println(set2);

        //find repeating elements and show them
//nested for loop
        for (int i = 0; i < array1.length; i++) {
            for (int k = i + 1; k < array1.length; k++) {
                if (array1[i] == array1[k]) {
                    System.out.println(array1[k]);
                }


            }
        }
        //use set

        HashSet<String> set3 = new HashSet<>();
        for (String word : array1) {
            if (!set3.add(word)) ;
            {
                System.out.println("Duplicate " + word);
            }
        }
    }
}