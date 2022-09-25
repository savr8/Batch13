package RecapJavaWithAhmed;

import java.util.Arrays;

public class MultiDimentionalArrays {


    public static class MultiDimensionalArray {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    *there is no specific interview verbal question for this part. But there is task
    about it:

    TASK:

    //Create a cost of array(STRING) //$23,$45,$32,$18
    //Create another month of array(STRING) //Jan,Feb,Aug,Oct

    //Put them in a map format(DO NOT USE MAP) with Multidimensional array (key=value)
    //key->month value->cost

   OUTPUT; Jan =$23   Feb=$45,  Aug = $32 Oct = $18

   TIPS:ONE LOOP IS ENOUGH TO SOLVE THIS QUESTION
   TIP: String[][] allTogether=new String[][];

   6:40 will be done
     */

        //AHMET, I Am a great java solver but I do not know where to start?
        //Ahmet answers; Starts from reading the task
        //1-
        public static void main(String[] args) {
            String[] cost = {"$23", "$45", "$32", "$18"};
            String[] month = {"Jan", "Feb", "Aug", "Oct"};
            String[][] allTogether = new String[2][4];

            for (int i = 0; i < cost.length; i++) {
                allTogether[0][i] = month[i];//all months
                allTogether[1][i] = cost[i];//all cost
                System.out.println(allTogether[0][i] + "=" + allTogether[1][i]);
            }
            System.out.println(Arrays.deepToString(allTogether));
        }


    }
}
