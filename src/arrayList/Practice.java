package arrayList;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        //syntax of ArrayList

        ArrayList list = new ArrayList();
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Shoes");
        shoppingList.add("Hat");
        shoppingList.add("Cup");
        shoppingList.add("glasses");

        boolean b = true;
        shoppingList.add(Boolean.toString(b));

        System.out.println(shoppingList);
        shoppingList.add(2, "milk");

        System.out.println(shoppingList);

        //get()--> is returning  element from given index
        System.out.println(shoppingList.get(0));

        String item1 = shoppingList.get(1);
        System.out.println("===========");
        System.out.println(item1);
        //size()-->it will return number(amount/count)of elements from arrayList
        System.out.println(shoppingList.size());
        Integer count = shoppingList.size();
        int count1 = shoppingList.size();
        //print out very last element from shopping list

        System.out.println(shoppingList.get(shoppingList.size() - 1));
    }
}
