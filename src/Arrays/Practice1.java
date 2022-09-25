package Arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        int[] ids = new int[5];//the number 5 is determining the capacity of the array

        System.out.println(ids);

        ids[1] = 11;
        ids[3] = 33;

        System.out.println(ids[0]);//0by default since wi did not assign any value to index'0'

        System.out.println(ids[1]);//11
        System.out.println(ids[3]);//33
        System.out.println("=========================");

        int l = ids.length;

        System.out.println("length of array is:" + l);
        for (int i = 0; i < l; i++) {
            System.out.println(ids[i]);
        }

        ids[0] = 9;
        ids[1] = 88;//reassigning 88 to the index1

        System.out.println(ids[1]);//88
//printing /showing from the array at once
        System.out.println(Arrays.toString(ids));//[9,88,0,33,0]

        System.out.println("================");
        ids[4]= 44;
        System.out.println(ids[4]);//44

        ids[5]=55;//run time errorArrayIndexOutOfBoundsException
      //  System.out.println(ids[5]);.ArrayIndexOutOfBoundsException

    }
}
