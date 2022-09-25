package primitives;

public class ReainderPractice
{
    public static void main(String[] args) {
        /*
        find sum of the digits given integer number

        int number =123;
        1+2+3 =6;"the sum of the digits of <number> is ..6.."

         */
        int number =123;//number 123
        int temp = number;

        int digit1 = number %10;//remainder is3
        number = number /10;
        int digit2 =    number % 10;//remaider is2
        number =number /10;
        int digit3 = number % 10;//remainder is 1
        System.out.println("The sum of digits of "+ temp +"is"+( digit1+digit2 + digit3));





    }
}
