package primitives;

public class ComaprisonOperators2 {
    public static void main(String[] args) {
        int num1 =4,num2 = 5;
        boolean r1 = num1 !=num2;//-->true
        System.out.println(r1);//true

        char ch1 = 'A',ch2='A';
        boolean r2 = ch1 != ch2;//false
        System.out.println(r2);//false

        boolean b1 =5==5;
        boolean b2 = true;
        boolean r3 =b1 !=b2;//false
        System.out.println(r3);//false

        System.out.println("====================");
        System.out.println(5<5);//false
        System.out.println(5<8);//true

        int number1 = (ch1 + 1 )*3;
        boolean r4 =23 > number1;
        System.out.println( "Result 4 is :"+r4);

        System.out.println("+++++++++++++++++++++");

        int a=4,b=5,c=10,d =25;
        //less than or equals
        System.out.println(a<=d);//true
        System.out.println(d<=(b+c+b));//false
        System.out.println( (c+d)<= (c+b+b+b));//false

//greater than or equal

        System.out.println(a>=d);//false
        System.out.println(d>=(b+c+b));//true
        System.out.println( (c+d)>= (c+b+b+b));//true

    }
}
