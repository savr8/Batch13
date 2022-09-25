package arrayList;

import object.Cookie;
import object.Flower;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        List items = new ArrayList();

        Flower fl = new Flower("Rose", 11);
        items.add("String");
        items.add(22);
        items.add(new Flower("Rose", 11));
        items.add(fl);

        ArrayList list1 = new ArrayList();
        list1.add(33);
        list1.add(true);
        list1.add("Phone");
        //adda Cocke object to this list
        list1.add(new Cookie());

        list1.add(new Scanner(System.in));
        System.out.println(list1);

        //sort??
//Collections.sort(list1);will not compile due to object type we have in the list1

        System.out.println(list1.size());//how many elements in array
        System.out.println(list1.get(list1.size() - 1));
        System.out.println(list1.get(5));//IndexOutOfBoundsException

    }
}
