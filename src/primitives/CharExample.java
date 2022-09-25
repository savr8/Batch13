package primitives;

import java.io.PrintStream;

public class CharExample
{
    public static void main (String[] args){

        char letter ='M';//decimal value letter M in the ASCII table is 77
        System.out.println(letter);//M

        System.out.println('M');//M

        System.out.println(letter + 100);;//M100,177,

        char letter1 =77;//M=77 in ASCCI table
        System.out.println(letter1);//M

        char symbol = 255;
        System.out.println(symbol );//y
        System.out.println( symbol + 100);//if u adding number it becomes number

        char digit ='1';//only one character in 'here'
        System.out.println(digit);//1

        System.out.println("=====================");

        int number ='A';
        System.out.println(number);//65

        System.out.println(number +100);//165

        System.out.println(number + digit);//65+49==>114
        System.out.println("++++++++++++++++++++++++++++++");
        char digit1 =1;
        System.out.println(digit1);//0
         char digit2 = 2;
        System.out.println( digit2);
        char digit3 =36;
        System.out.println(digit3);



    }
}




