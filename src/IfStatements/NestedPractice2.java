package IfStatements;

public class NestedPractice2 {
    public static void main(String[] args) {

        /*
        week days -->Efe
        weekend -->Yusuf
         */

        String option = "zxxcxz";
        String day = "mn";
        if (option.equalsIgnoreCase("weekday")) {
            //Efe-->tues,weds
            if (day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday")) {
                System.out.println("EFE is available");

            } else {
                System.out.println("EFE is not available");
            }
        } else {
            System.out.println("This is weekend and instructor is Yusuf");
            //Yusuf
        }
    }
}
