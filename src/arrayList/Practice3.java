package arrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Denver");
        cities.add("Dallas");
        cities.add("New York");

        System.out.println(cities.indexOf("Denver"));
        //  0       1        2      3
        System.out.println(cities);//[Chicago, Denver, Dallas, New York]

        //  System.out.println(cities.get(4));//IndexOutOfBoundsException because last index is 3

        //remove()
        cities.remove(2);
        cities.remove("Denver");
        System.out.println(cities);


        //set()-->replace element at a specific index
        cities.set(0, "LA");
        System.out.println(cities);

        System.out.println(cities.size());

        //isEmpty()
        System.out.println(cities.isEmpty());

        //clear()-->removes all elements from arrayList
        cities.clear();
        System.out.println(cities.isEmpty());
        System.out.println(cities.indexOf("Denver"));


        //contains()

        Boolean b = cities.contains("Dallas");
        System.out.println(b);
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Water");
        drinks.add("Tea");

        //addAll()

        cities.addAll(drinks);
        System.out.println(cities);
        cities.addAll(1,drinks);
        System.out.println(cities);

        cities.remove(drinks);
        System.out.println(cities);
        cities.set(1,"ABC");
        System.out.println(cities);
        cities.removeAll(drinks);
        System.out.println(cities);
        cities.indexOf("LA");

        //replace on the String ??

        //  String str = "Java";
        //  str = str.replace('a','$');

        //  System.out.println(str);

    }
}
