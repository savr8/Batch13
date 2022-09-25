package Switch;

import java.util.Locale;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*
        1 It -->Alex,Zack,Diana
        2 HR -->Tima,Ana
        3 Admin-->Tima ,David
        Default General -->John

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose from following departments:\n1 - IT\n2 -HR\n3 - Admin");
        int department = scanner.nextInt();
        switch (department) {
            case 1:
                System.out.println("Who do you want to speak from IT department?\nAlex\nZack,\nDiana");
                String name = scanner.next().toUpperCase(Locale.ROOT);
                switch (name) {
                    case "ALEX":
                        System.out.println("you are connected to Alex");
                        break;
                    case "ZACK":
                        System.out.println("You are connected to Zack");
                        break;
                    case "DIANA":
                        System.out.println("You are connected to Diana");
                        break;
                    default:
                        System.out.println("There is no" + name + "in IT department");
                        break;
                }break;
            case 2:

                System.out.println("Who do you want to speak from HR department?\nTima\nAna");
                String nameHR = scanner.next().toLowerCase();
                switch (nameHR) {
                    case "tima":
                        System.out.println("you are connected to Tima");
                        break;
                    case "ana":
                        System.out.println("You are connected to Ana");
                        //SHE IS AVAILABLE AFTER 1PM
                        break;
                    default:
                        System.out.println("There is no such a person in HR department");
                        break;
                }break;
            case 3:
                System.out.println("Who do you want to speak from HR department?\nDavid\nTima");
                String nameAdmin = scanner.next().toLowerCase();
                switch (nameAdmin) {
                    case "tima":
                        System.out.println("you are connected to Tima");
                        break;
                    case "david":
                        System.out.println("You are connected to David");
                        break;
                    default:
                        System.out.println("There is no such a person in Admin department");
                        break;
                }break;
            default:
                System.out.println("No matching Department for you entry,You are connected to John");
                break;

        }

    }
}
