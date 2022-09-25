package IfStatements;

public class IfPractice1
{
    public static void main(String[] args)
    {


        System.out.println("This is beginning of the code");
        //if

        if (3 == 3) {
            System.out.println("Tjis is inside of If Block");
        }

        if (3 == 5) {
            System.out.println("Tjis is Second If Block");
        }
        System.out.println("This is end of the code");

        //you can have multiple if statements
        int apple = 20;
        int oranges = 40;
        //print out 'Hi' when there are numbers of apples than oranges


        if (apple > oranges) {

            System.out.println("Hi");
        }

        //print out 'BYE' when there is same amount of apples and oranges
        if (apple == oranges) {
            System.out.println("BYE");
        }
        int myMoney = 100, apple$ = 2, oranges$ = 3, totalCoast;


        totalCoast = (apple$ * apple) + (oranges$ * oranges);
        if (totalCoast <= myMoney) {
            System.out.println("I can BUY fruits");

        }
    }
}
