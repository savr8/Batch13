package String;

import java.util.Scanner;

public class MethotTask2 {
    /*
      Get information  of user in the following format : M - David White - 1999
        -check if the input string is starting with F
         -check if the input string is ending with M
          -check if the input string equals to your name
          -check if the input string is ending with year 2000
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("please enter your name last name and date of birth");

        String data = userInput.nextLine();

        System.out.println(data.startsWith("F"));

        System.out.println(data.endsWith("M"));

        System.out.println(data.equals("Savr"));
        System.out.println(data.endsWith("2000"));
        //replace the birth year with *s
        //M- David White -1999
data = data.replace("1999","****");
        System.out.println(data);
        String part = data.substring(data.length()-4);
        System.out.println(data.replace(part,"****"));








    }



}
