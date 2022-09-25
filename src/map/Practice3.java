package map;

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Strawberry", "LA");
        map.put("Watermelon", "Chicago");
        map.put("Apple", "Madison");
        map.put("Potatoes", "Idaho");
        map.put("banana", "miami");

        // bring keys and values together
        //entrySet()

        System.out.println(map);
        System.out.println(map.entrySet());

        Set<Map.Entry<String, String>> keysAndValues = map.entrySet();
//[banana=miami, Apple=Madison, Potatoes=Idaho, Watermelon=Chicago, Strawberry=LA]

        // print out pairs one by one!!

        for (Map.Entry<String, String> pair :keysAndValues){
            System.out.println(pair);

        }


        System.out.println("++++++++++++++++");
        System.out.println(map.keySet());

        System.out.println("===============");
        System.out.println(map.values());

    }
}
