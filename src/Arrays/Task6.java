package Arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        /*
                {"Monday", "Tuesday", "Wednesday", ....}
                print every element in reverse version from this array
                yadnoM, yadseuT, ...
         */
        String str = "Monday";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++

       //store reversed string into new array

        String []reversedDay =new String[weekDays.length];
        int index=0;
        for (String day : weekDays) {
            String reverse1 = "";

            for (int i = day.length() - 1; i >= 0; i--) {
                reverse1 = reverse1 + day.charAt(i);
            }
            System.out.println(reverse1);
            reversedDay[index]=reverse1;
            index++;
        }
        System.out.println(Arrays.toString(reversedDay));

    }
}
