package primitives;

public class Casting {
    public static void main(String[] args) {
        //larger numerical data type to smaller num data type
        long lg = 25;
        //int i = lg;//compile error trying to store larger data tosmaller data,requires Casting
        System.out.println("lg>>"+lg);

      int i1 = (int) lg;
        System.out.println("i1>>"+i1);

        long lg2 = 465342533412l;
        int i2 = (int)lg2;
        System.out.println("i2>>"+i2);
        //from decimal to whole
        double db1 = 2.3;
        System.out.println("db1>>"+db1);//2.3
        short sh1 = (short)db1;
        System.out.println("sh1>>"+sh1);//2
        short sh2 = (byte)db1;
        System.out.println(sh2);
        byte bt1= (byte) db1;
        char ch1 ='d';
        short i3 =(short) ch1;
        System.out.println("i3>>"+i3);//100
        byte b1 = 4 ,b2 =5;
        byte r1 =(byte) (b1 +b2);//we should cast the final result of the arithmetic operation
                                 //to same data type to compile/match

        System.out.println("r1>>"+ r1);

        short google=275,iphone=800;
        short coast=(short)(google+iphone);
        System.out.println("total coast $"+coast);


    }
}
