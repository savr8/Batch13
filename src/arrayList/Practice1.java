package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Practice1 {
    public static void main(String[] args) {

        /*
        *create an Arraylist and store 6 colors
        * print out each color from the arraylist one by one
         */

        ArrayList <String>colors = new ArrayList<>();

        colors.add("red");
        colors.add("black");
        colors.add("yellow");
        colors.add("blue");
        colors.add("green");
        colors.add("grey");
        colors.add("orange");

        System.out.println(colors);

       for(int i=0;i<colors.size();i++){
           System.out.println(colors.get(i));

       }
        System.out.println("===================");


       for (String color:colors){
           System.out.println(color);
       }
        System.out.println("++++++++++++++++");
        System.out.println(colors);
        Collections.sort(colors);//sorting arrayList in ascending order
        System.out.println(colors);
        Iterator iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        }
    }


