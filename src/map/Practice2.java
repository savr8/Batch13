package map;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        HashMap<String,String> map= new HashMap<>();

        map.put("Strawberry","LA");
        map.put("Watermelon","Chicago");
        map.put("Apple","Madison");
        map.put("Potatoes","Idaho");
        map.put("banana","miami");
        //if name of the fruit/veggie is starting with 'A'/'a' show the city of it

        /*
        step1 - get all keys
        step 2 - if statement to check if fruits starts with 'a'/'A'
        step3 -get the value of that fruits

         */


       Set<String> fruits = map.keySet();
       for (String fruit :fruits){
           if(fruit.startsWith("a")||fruit.startsWith("A")){
               System.out.println(map.get(fruit));
           }
       }
 //contains();
        Boolean b = map.values().contains("Srawberry");
        System.out.println(b);

        //containsValue()-->it checks if provided element is one Value on the map

        Boolean b1 =map.containsValue("Strawberry");
        System.out.println(b1);

        //containsKey() -->it checks if provided element is one of KEY on the map
       Boolean b2= map.containsKey("Strawberry");

        System.out.println(b2);

        //remove()
        System.out.println(map);
        map.remove("Apple");
        System.out.println(map);

        map.remove("Strawberry","LA");
        System.out.println(map);

        //replace()
        map.replace("Potatoes","DENVER");
        System.out.println(map);
        map.replace("Potaoes","DENVER","CHICAGO");
        System.out.println(map);
        map.put("Potatoes","12345");
        System.out.println(map);

        //size
        System.out.println(map.size());
         //isEmpty()
        System.out.println(map.isEmpty());//False

        //clear
        map.clear();
        System.out.println("Cleared the map");

        System.out.println(map.isEmpty());//true
    }

}
