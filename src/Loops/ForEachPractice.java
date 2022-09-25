package Loops;

public class ForEachPractice {
    public static void main(String[] args) {
        String[] cities = {"Chicago", "Springfield", "Denver", "Malibu", "New York"};
        for (String city : cities) {
            System.out.println(city);
        }

        //create an integer array,give some values,and find sum of numbers that you have in the array
        //use for-each loop to solve this ask

        int[] numbers = {2, 5, 6, 8};

        int sum = 0;

        for (int num : numbers) {
         sum=sum+num;


        } System.out.println(sum);


    }
}
