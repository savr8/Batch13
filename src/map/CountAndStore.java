package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CountAndStore {
    public static void main(String[] args) {
        String[] alphabet = {"a", "b", "c", "j","j","j","j","j","a", "a", "d", "c", "e", "d", "b"};
        /*
        a -3
        b- 2
        c--2
        d- 2
        e- 1

         */
        HashMap<String, Integer> map = new HashMap<>();


        for (String letter : alphabet) {

            if (!map.containsKey(letter)) {


                map.put(letter, 1);

            } else {
               int value = map.get(letter);
               map.put(letter,value+1);
            }
        }
        System.out.println(map);
    }
}
