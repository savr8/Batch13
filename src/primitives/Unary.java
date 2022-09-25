package primitives;

public class Unary {
    public static void main(String[] args) {
        int flower = 7;
        System.out.println(flower);
        flower++;
        System.out.println(flower);
        flower--;
        System.out.println(flower);
        flower--;
        flower--;
        flower--;
        flower++;
        System.out.println(flower);
        System.out.println("___________________________");
        int item = 6;
        int count = item-- + item--;//6+5
        System.out.println(count);

        int num=3;
        System.out.println(num++);//>>shows 3,num4
        System.out.println(num);//5
       ++ num;
        System.out.println(num);//6
        --num ;
        System.out.println(num);//5
        --num;
        System.out.println(--num);//3

    }
}
