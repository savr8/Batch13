package primitives;

public class ComparisonOperators3 {
    public static void main(String[] args) {
        /*
        * event of the child's age less than 7 ,they can attend*/

        int  kidAge = 1;
        int requaredAge =7;

        boolean canAttend = kidAge < requaredAge;
        System.out.println("Can child attend:"+ canAttend);//true

       boolean canAttend1= kidAge > requaredAge;
        System.out.println("Can child attend?"+ canAttend1);//false

        /*
        there is a picnic only kids that are of age of 14 can attend
        */
        boolean canAttend2 = kidAge == requaredAge;
        System.out.println("Is the child's age 14?"+ canAttend2);//false;
        /*
        there is a party ,they are not taking to the party if their age is 18
        */

        requaredAge =18;
        boolean canAttend3= kidAge!= requaredAge;
        System.out.println("Can Attend ?"+ canAttend3);//true





    }
}
