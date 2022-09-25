package WrapperClasses;

public class Practice1 {
    public static void main(String[] args) {

        byte bt =6;
        Byte b = new Byte(bt);
        System.out.println(b);

        Byte b1 =new Byte("7");
        Integer i =new Integer(5);
        Long l =new Long(100);
        System.out.println(l);
        Character c = new Character('C');

        System.out.println(c);
        Boolean bl=new Boolean(true);
        boolean blPrimitive=true;
        System.out.println(bl);//true
        System.out.println(blPrimitive);//true

//Autoboxing
        Integer number=11;//autoboxing-->primitive data is converted to Wrapper Object by Java
        Integer number1=11;
        System.out.println("=============");
        System.out.println(number==number1);
        System.out.println(number.equals(number1));

        System.out.println("================");
        Integer num1=new Integer(2);
        Integer num2=new Integer(2);

        System.out.println(num1==num2);//false
        System.out.println(num1.equals(num2));//true

        Character letter ='a';//autoboxing

        //Casting-->Auto casting -->smaller to Larger
                 //--> Larger to Smaller or decimal to whole number
        Integer num3 = (int)3.4;//Casting and autoboxing

        //Wrapper to primitive:Unboxing

        Integer num4 =66;

        int num5=num4;//Uboxing-->wrapper is converted to primitive data

        Long num7 =3l;
        Long num6 =(long)5.6;
        System.out.println((int)(5.6));
        Long num8= Long.valueOf((int)5.6);
    }
}
