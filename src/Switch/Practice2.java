package Switch;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        ask user to provide number between 1 and 5
        print the name of the day for users entry
        1-->Monday
        2-->Tuesday
        ..Friday

         */
        Scanner input = new Scanner(System.in);
        System.out.println("we will guss the day base on you number,please enter number from 1 to 5");
        int num= input.nextInt();
        switch (num){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("There is no matching day"
                        );
        }

    }
}
