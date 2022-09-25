package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Practice2 {
    public static void main(String[] args) {
        HashSet<String> set1 =new HashSet<>();
        LinkedHashSet<String> set2 =new LinkedHashSet<>();
        TreeSet<String> set3 = new TreeSet<>();
        set1.add("Tuesday");set2.add("Tuesday");set3.add("Tuesday");
        set1.add("Monday");set2.add("Monday");set3.add("Monday");
        set1.add("Friday");set2.add("Friday");set3.add("Friday");
        set1.add("Wednesday");set2.add("Wednesday");set3.add("Wednesday");
        set1.add("Thursday");set2.add("Thursday");set3.add("Thursday");

        set1.add(null);set2.add(null);//set3.add(null);.NullPointerException

        set1.add("Tuesday");set2.add("Tuesday");set3.add("Tuesday");


        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        set3.pollFirst();
        System.out.println(set3);
        set3.remove("Tuesday");
        System.out.println(set3);
        set3.pollLast();
        System.out.println(set3);
     set3.descendingSet();
        System.out.println( set3.descendingSet());


    }}
