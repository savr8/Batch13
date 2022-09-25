package RecapJavaWithAhmed;

public class JavaPrimitiveASCIITable {
    /*
POSSIBLE INTERVIEW QUESTIONS:
1- What is Java what is JDK,JVM,JRE?(indian style)
2- What do you know about JDK,JVM,and JRE?(american style)
     TIPS:Before Interview check the name of interviewers to make yourself
     ready for the style questions

1-Java is programing language :There are 3 peaces of Java
    -JDK--->(java development kit)which has specific libraries and it develops the application
    -JRE-->(Java runtimeEnvironment)which has libraries and set of software tools which are responsible for execution
    -JVM-->(Java virtual machine)whict is responsible for converting BYTE code to binary code.

2-PRIMITIVE DATA TYPE:
     *WHOLE NUMBER:
     -int
     -long
     -byte
     -short

     *Decimal number:
     -float-->f
     -double-->d

     *CONDITION:
     -boolean-->true/false

      short a=5;
      short b=6;
      short c=a+b-2;
      sout(c);
      ansver:compile time error because once you work on any primitives below int-->it will be
      converted into the int variable or you cast it.(example is below)

3-ASCII TABLE:
It is a way to store all the characters,symbols,alphabets,numbers..etc.Java refers
this table once you work on characters(CHAR) primitive data type




     */
    public static void main(String[] args) {
   //
        short a=5;
        short b=6;
        short c=(short)(a+b-2);
        int d= a+b-2;
        System.out.println(c);
//example ASCII TABLE
        char letter = 65;
        char letter2 = 'g';
        int  number = (char)('g');
        System.out.println(letter);//A
        System.out.println(letter2);//g
        System.out.println(number);//103


    }


}
