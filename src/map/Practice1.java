package map;

import java.util.*;


public class Practice1 {
    public static void main(String[] args) {

        HashMap<Integer, String> studenMap = new HashMap<>();

        studenMap.put(111, "David");
        studenMap.put(222, "Mustafa");
        studenMap.put(333, "Anna");
        studenMap.put(777, "James");
        studenMap.put(555, "Bond");
        studenMap.put(1, "Dima");
        System.out.println(studenMap);

        studenMap.put(111, "Sam");
        System.out.println(studenMap);

        studenMap.put(666, "Sam");
        System.out.println(studenMap);
        studenMap.get(666);//this is going to return VALUE of the key-->Sam

        System.out.println(studenMap.get(666));
        System.out.println(studenMap.get(777));
        String name1 = studenMap.get(333);
        System.out.println(name1.concat(" Hello!"));//Anna

        //null key or null value

        studenMap.put(null, "Tima");
        System.out.println(studenMap);
        studenMap.put(null, "John");
        System.out.println(studenMap);
        studenMap.put(888, null);
        studenMap.put(444, null);
        studenMap.put(999, null);
        System.out.println(studenMap);
        //get() -->return VALUE for given KEY

        //create an email address for each student if student value is not null
        //printout those email addresses
        studenMap.get(111);//-->Sam

        //need to get all the keys
//need to get all the keys -->use keySet() to get all keys from map
        //return of keySet()method is SET!!!
        Set<Integer> keys = studenMap.keySet();

        System.out.println(keys);
        System.out.println("==================");
        for (Integer key : keys) {
           // System.out.println(studenMap.get(key));
            if(studenMap.get(key)!=null){
                System.out.println(studenMap.get(key).concat("@gmail.com"));
            }
        }
//how to reach out all values?
     /* Collections<String> values = studenMap.values();//return all values-->
        System.out.println("------------");
        System.out.println(values);
        //say Hi to each other
        for (String value:values){
            if (value!=null){
            System.out.println("Hi "+value);}
           else{ System.out.println("Bye "+value);}
        }
    */

}}
