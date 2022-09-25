package primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        /*
        find the product of digits from given numbers
        22==>2*2*2 =8
         */
        int num =222;
       int temp = num;
        int dig1 = num % 10;
        num = num /10;

        int dig2 = num%10;
        num = num /10;
        int dig3 =num%10;

        System.out.println( "the product of digits of"+ temp +"is"+dig1*dig2*dig3);






    }
}
