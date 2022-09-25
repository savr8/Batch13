package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {


        HashSet set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet<>();
        Set set3 = new HashSet<>();
        Set<String> set4 = new HashSet<>();
        System.out.println(set2);
        set2.add(11);
        set2.add(22);
        set2.add(44);
        set2.add(66);
        System.out.println(set2);
        set2.add(33);
        System.out.println("this is before adding duplicate"+set2);
        set2.add(33);
        System.out.println("this is after adding duplicate"+set2);
        set2.add(null);
        System.out.println(set2);
        System.out.println("------------------");
        //set2.get();no get method!!
        for(Integer i:set2){
            System.out.println(i);

        }
        System.out.println("============");
        //iterator
        Iterator iterator = set2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
