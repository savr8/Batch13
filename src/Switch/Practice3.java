package Switch;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user for their favorite fruit
        -strawberry,apple,kiwi,dragon fruit,banana,
        pineapple,mango
        if you have in the store
        -->we have that fruit in the store
        if you dont have it in the store
        -->we do not have ...fruit ..in the store
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Whats your favorite fruit");
        String favorite = input.nextLine().toLowerCase();
        switch (favorite){
            case "strawberry":
                System.out.println("we have "+favorite);
                break;
            case "apple":
                System.out.println("we have"+ favorite);
                break;
            case "kiwi":
                System.out.println("we have"+favorite);
                break;
            case "dragon fruit":
                System.out.println("we have "+favorite);
                break;
            case "pineapple":
                System.out.println("we have"+favorite);
                break;
            case "mango":
                System.out.println("we have "+ favorite);
                break;
            default:
                System.out.println("we do not have this "+ favorite+"at the store");
        }


    }
}
