package String;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        String day= "Saturday";

        day.split("a");

        System.out.println(  day.split("a"));//

        String[] x ={"A","B","C"};

        System.out.println(Arrays.toString(x));

        System.out.println(Arrays.toString(  day.split("a")));

        String [] strArray =  day.split("a");//[S,turd,u]

        System.out.println(Arrays.toString(strArray));

        System.out.println(day.toUpperCase());

        //create for each loop to print elements from strArray

        for (String str:strArray)
        {
            System.out.println(str);
        }

        String apple ="apple is red";

       String[]applParts= apple.split("a");

        System.out.println(Arrays.toString(applParts));

        //print every element from appleParts array as UpperCase

        for(String part:applParts){
            System.out.println(part.toUpperCase());
        }


    }
}
