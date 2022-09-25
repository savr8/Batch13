package arrayList;

import object.Task;

import java.util.ArrayList;

public class Task1 {
    public static void printList(ArrayList<String>list){
        for (int i =0;i<list.size();i++){
            if (list.get(i).length()>3) {
                System.out.println("This Drink has more than 3 letters: "+list.get(i));
            }
            }
        }

    public static void main(String[] args) {
        //create a method that will take an ArrayList as a parameter
        //this method will show only drinks which has length of more than 3 letters
        //Assume that you have list of drinks to test

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Milk");
        drinks.add("bear");
        Task1 obj=new Task1();
        obj.printList(drinks);


    }
}
