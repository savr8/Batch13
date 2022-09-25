package primitives;

public class DataTypes {

    public static void main(String[]args)
    {
        /*
        byte,short,int,float,double,char,boolean
       */


        byte num1 = 127;
        byte num2=-128;
        //byte num3 =200;byte data can store only stare in range of-128 to 127

        short num3 =4;

        //num1 = num3;you cant store short data type to the byte data type

        num3 = num1;
        System.out.println("This is num3:" +num3);//this is num3:127

        int num4 =num1 +5 + num3;
        System.out.println(num4);

        long num5 = 3;
        long num6 = 547629384928347L;
        //==============

        float num7 = 2.3f;
        float num9 =2;
        System.out.println("num9 which is floating number as 2>>" +num9);

        double num8 = 7;
        System.out.println("num8:"+num8);
        double num10 =6.7;
        System.out.println("This is num10  >>>"+ num10);

        ///=============CHAR===============
        char letter = 'a';
            System.out.println(letter);//a
        char number ='6';
        System.out.println(number);//6
        char symbol = '#';
         System.out.println(symbol);//#
        char number1='T';
        System.out.println(number1);//T







        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
