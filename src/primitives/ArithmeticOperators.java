package primitives;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 3,b = 5,c = 8,d= b + 5;

        //+,-,*,/,%(modulus)

        c = c + b + d;
        System.out.println("The value of c" + c);//c 23

        System.out.println(c-11);//12

        int result1 = a * c;

        System.out.println(result1);//3*23=69

        int result2 = result1 / 2;//69/2=>34
        System.out.println(result2);

        double result3 = result1 / 2;//69/2=>34

        System.out.println(result3);

        float result4 = result1 / 2;//69/2=>34

        System.out.println(result4);

        //modulus -->% --> remainder from division

        //i have 12 sand.-->2 sand for each person .there are 5 people--> remainder is 2

        int x =11, y = 2;

        int remainder1 = x%y;

        System.out.println(remainder1);//1

        System.out.println(16 % 10);//6
        double r2 = 53 % 3;
        System.out.println(r2);//2.0

        System.out.println(450%100);//
        int bur =35,kids =10;
        System.out.println(bur%kids + "   burger left over");










    }
}
