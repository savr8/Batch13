package String;


import java.util.Scanner;

public class MetodsTask1 {
   /* TASK: write a java program to get string from user
    from given string:
            -find and print:
    first character
    last character
    index of second matching 't'
    length of string
    index of middle character
    middle character
 */

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("please enter any string");

       String text = scanner.nextLine();

       //Hello
        System.out.println("The first letter from "+ text +" is: " + ( text.charAt(0))   );
        System.out.println("The last letter from "+text + " is: "+ (text.charAt( text.length()-1  )));
        System.out.println("The length of the string is: "+ text.length());
        System.out.println("The index of middle char is: "+ text.indexOf(   text.charAt(   text.length()/2 )   ));
        System.out.println("The middle char is: "+ text.charAt(   text.length()/2 ) );
        System.out.println( "Index of second matching 't' is: "+ text.indexOf('t', text.indexOf('t')+1)  );
        int indexOfT = text.indexOf('t',text.indexOf('t')+1);
        System.out.println(indexOfT==-1);//if there is no 't',this line is going to print TRUE

    }


}
