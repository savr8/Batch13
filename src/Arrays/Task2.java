package Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {


        //print out numbers which are less than 30
        int[] studentIds = {44, 67, 5, 21, 55, -35, 500};
        int index = 0;
        while (index < studentIds.length) {

            if (studentIds[index] < 30) {
                System.out.println(studentIds[index]);
            }
            index++;
        }
        System.out.println("================");


        for (int index1 = 0; index1 < studentIds.length; index1++) {

            if (studentIds[index1] < 30) {
                System.out.println(studentIds[index1]);
            }
        }


    }

}
