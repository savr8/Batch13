package Arrays;

import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int[] numbers = {21, 3, 6, 7, 10, 65, 54, 2};
        System.out.println(Arrays.binarySearch(numbers, 54));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));//[2, 3, 6, 7, 10, 21, 54, 65]
        System.out.println(Arrays.binarySearch(numbers, 54));
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 100));
    }
}
