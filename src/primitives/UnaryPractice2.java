package primitives;

public class UnaryPractice2 {
    public static void main(String[] args) {
        //pre- increment,pre-decrement-->++name,--name
        //post-increment,post-decrement-->name++,name--

        int burgers = 20;

        int sum = burgers++ + ++burgers + 5 + ++burgers /2;
        //        20            22         5     23/2
        System.out.println("The sum is:"+ sum);//58
//          24     24     24  25
        int a = ++burgers,b = a++,c=--burgers;
        System.out.println(a);//25
        System.out.println(b);//24
        System.out.println(c);//23


        //       24         25         23
        System.out.println(++a + --b);//49
        System.out.println("burgers "+ burgers);

    }
}
