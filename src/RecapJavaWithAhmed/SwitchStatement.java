package RecapJavaWithAhmed;

import java.util.Scanner;

public class SwitchStatement {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-It is not likely to have directly switch question.
    2-IN what condition would you use Switch and IF/else statements?

    NOTE:WhenEver you have limited conditions always go with SWITCH STATEMENT
    NOTE 2: When you have 1 or 2 conditions or Limitless conditions then go with IF statement.
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please put a number");
        int option = scan.nextInt();
            switch (option){
                case 1:
                System.out.println("You are talking to Ahmet");
                break;
                case 2:
                System.out.println("You are talking to Adrian");
                break;
                case 3:
                    System.out.println("You are talking to Aizat");
                    break;
                  case 4:
                  System.out.println("You are talking to Mustafa" );
                  break;
                default:
                    System.out.println("You have no one to talk");
            }

    }


}
