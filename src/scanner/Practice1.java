package scanner;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        String text = new String();

        text ="Java";
        System.out.println(text);

        Scanner scanner = new Scanner(System.in);

        String myName ="Sam";

        System.out.println("Please enter your name");
        myName = scanner.nextLine();//it gonna take textand put it to myName

        System.out.println("Hello "+myName);
        System.out.println("Please enter your last name");
        String lastName=scanner.nextLine();

        System.out.println("Your full name is"+" "+myName+" "+lastName);

        System.out.println("Please enter your zip code");

        int zip =scanner.nextInt();

        System.out.println("Hey"+ myName+"you are living in this " + zip+" zip code");

        scanner= new Scanner(System.in);


        //Task get address from user and show it as"***...***"
        System.out.println("Please enter you address");
        String address = scanner.nextLine();
        System.out.println("*****"+address+"******");

        System.out.println("++++++++++++");

        System.out.println("enter your Phone Number");

        long phoneNumber= scanner.nextLong();

        System.out.println("Is this phone correct? "+phoneNumber);

        String yesNo = scanner. next();
        System.out.println("You said "+yesNo);



    }
}