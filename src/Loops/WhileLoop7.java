package Loops;

public class WhileLoop7 {

    public static void main(String[] args) {
        /*
        you have $40 in your international phone calling account
        every call cost $5
        find out haw many calls you can make with this $40
        ->"this is your 1.call.Remaining balance is..$35"
        ->"this is your 2.call.Remaining balance is..$30"
        ...
         */
        int balance = 40, call = 5, count =0;

        while (balance >= call) {

            count++;
            balance=balance-call;
            System.out.println("this is your " + count + ".Remaining balance is" +balance);

        }
    }
}