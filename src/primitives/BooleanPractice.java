package primitives;

public class BooleanPractice {
    public static void main(String[] args) {
        //boolean data type can only take true or false as value

boolean isEmpty = true;

        System.out.println(isEmpty);//true

        isEmpty = false;
        System.out.println(isEmpty);

        boolean isLightOn = true;

isLightOn=isEmpty;
        System.out.println(isLightOn);//false

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(!isLightOn);//true !-->means opposite

        System.out.println(5==5);//true comparison
        System.out.println(5==4);//false comparison
        }
}
