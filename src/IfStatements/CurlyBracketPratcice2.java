package IfStatements;

public class CurlyBracketPratcice2 {
    public static void main(String[] args) {
        double  money = 100;

        double itemPrice = 200;

        if(money < itemPrice)
            System.out.println("You can not buy this item");
        System.out.println("It is sunny day");

        String color= "white";
        if(color.length()<10)
            System.out.println("This color has less than 10 letters");
        System.out.println("Is it break time yet?");

        System.out.println("+++++++++++++++++");
        //decrement/Invrement ++--
        int a = 5,b=3,x;
        a++;

        if(a<b+b)
            b++;//this statement will be skipped,because of if condition returns false
         x=a+ ++b;//x=10
        if (x>20)
            System.out.println(x);//this statement will be skipped,because of if condition returns false
        --x;
        System.out.println(x);//9
    //it will print x one
        //x will be 9
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//==============================================================
        if(a<b+b) {
            b++;//this statement will be skipped,because of if condition returns false
            x = a + ++b;//x=10
        }
        if (x>20) {
            System.out.println(x);//this statement will be skipped,because of if condition returns false
            --x;
            System.out.println(x);
        }








    }
}
