package object;

import java.util.Arrays;

public class MethodPractice2 {
    /*
    create a method that will find sum of the numbers from given array
    return the sum as double
    {1,2,3,4,5,6,7,8,9}
     */
    public double sumFinder(int[] array) {
        double sum = 0;
        for (int number : array) {
            sum = sum + number;
        }
        return sum;
    }
    // create a method that prints following message for your favorite fruits
    // ...apple.. is healthy.
    // {apple, banana, strawberry,..}
    // Return a String array which is going to contain all the sentences that we will create
    // find a way to show all created messages
    public String[] printMessage(String[] fruits) {
        String[] sentences = new String[fruits.length];
        for (int i = 0; i < fruits.length; i++) {
            //  System.out.println(  fruits[i].concat(" is healthy")   );
            sentences[i] = fruits[i].concat(" is healthy");
        }
        return sentences;
    }
    public static void main(String[] args) {
        MethodPractice2 object1 = new MethodPractice2();
        String[] favoriteFruits = {"apple", "banana", "strawberry"};
        object1.printMessage(favoriteFruits);
        String[] bucket = object1.printMessage(favoriteFruits);
        System.out.println(Arrays.toString(bucket));
        //==finding sum of numbers from array===========
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double result1 = object1.sumFinder(numbers);
        System.out.println(result1);
    }

}
