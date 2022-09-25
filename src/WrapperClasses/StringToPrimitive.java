package WrapperClasses;

import object.Door;

public class StringToPrimitive {

    public static void main(String[] args) {
        String str = "15";
        System.out.println(str);

        System.out.println(15 + str);
        System.out.println(str + 15);
        System.out.println(15 + 15 + str);
        System.out.println(str + 15 * 15);
        //++++++++++++++++++++++++++++++++++++++++++++++

        int number = Integer.parseInt(str);
        System.out.println(number);

        // System.out.println(str==number);
        System.out.println(number + 15);
        System.out.println(15 + number);
        System.out.println(3 * number);
//convert string to double?
        String str1 = "11.5";

        double decNumber = Double.parseDouble(str1);//string as primitive double

        Double deNumberObject = Double.parseDouble(str1);//first parse to primitive double then store in object with help of Autoboxing

        System.out.println(decNumber - 3);

        //   int number1 = Integer.parseInt(str1);//NumberFormatExeption


        String str2 = "A";
        //you can not parse to Character

        String str3 = "true";
        boolean t = Boolean.parseBoolean(str3);
        System.out.println(">>>" + t + "<<<<<<<<<<<<");
        System.out.println(t == true);

        Boolean tt = t;//AutoBoxinng from boolean to object Boolean
        System.out.println(tt.equals(t));


    }
}
