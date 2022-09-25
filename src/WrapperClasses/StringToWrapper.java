package WrapperClasses;

import object.Flower;

public class StringToWrapper {
    public static void main(String[] args) {
        String str ="17.5";
        //convert above string to wrapper object Float

        //valueOf();
        Float number = Float.valueOf(str);//autoboxing

        float num =Float.valueOf(str);//unboxing
        System.out.println(number+10);

        float number1 =Float.parseFloat(str);
        Float number2 = Float.parseFloat(str);

    }
}
