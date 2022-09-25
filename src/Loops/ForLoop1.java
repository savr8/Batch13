package Loops;

public class ForLoop1 {
    public static void main(String[] args) {
        //use while loop print numbers 1 to 10
        int number = 1;
        while (number < 10) {
            System.out.println(number);
            number++;
        }

        //  //use for loop print numbers 1 to 10

        for (int a = 1; a < 10; a++) {
            System.out.println(a);
        }
        //System.out.println(a);Since 'a' is local veriable in the for loop,we cannot access it fromout of scope of for loop

        //use for loop and print number from 5 to-5;

        for (int b = 5; b >= -5; b--) {
            System.out.println("b-->" + b);
        }
        System.out.println("================");
        int x=1;

        for ( ; x >= -5; ) {
            System.out.println(x);
            x--;
        }

        System.out.println("++++++++++++++");
        //below for loop is INFINITE FOR LOOP
       // for(;;){
         //   System.out.println("Nothing in the for parameter parantesis ");
       // }
    }

}

