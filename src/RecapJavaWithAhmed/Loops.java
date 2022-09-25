package RecapJavaWithAhmed;
import java.util.*;
import java.util.Scanner;

public class Loops {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-Many technical interview questions they require loops to solve the questions.
    LOOPS:It is a way to  iterate(circle) the elements(value,items,variables)one by one.
    In other words:is a cycle for the repetitive actions.
    Types of Loops:
    1-Do while
    2-While
    3-For Loop-->**second best
    4-For Each Loop-->*** best

DO WHILE:
   do{
   Scanner scan= new Scanner(System.in)
   int choice = scan.nextInt();
   }
   while(choice !=2)


  TASK:
    1-Ask the user (Scanner) to input word and reverse it?
    -->before you start the path that you will follow
    -->What would be your approach to solve this question

TASK 2:
1-By using while loop can you reverse the numbers and multiple digits?
1453-->OUTPUT=>3541 and OUTPUT2 =>60

  */
    public static void main(String[] args) {

        //     Scanner scan = new Scanner(System.in);
        //      System.out.println("Please enter word");
        //     String word = scan.nextLine();//Ahmet
        String word = "Ahmet";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.substring(i, i + 1);//we dont care i+1 it will give t+1;

        }
        System.out.println(reversed);

    //TASK-2:
    int sum = 1;
    String reversed1 = ""; //1453 -->%10-->3 1453/10-->145%10-->5 4 1/10-->0
    int number = 1453;

    while(number !=0){
        int digit = number % 10;//3
        sum += digit;//3
        reversed1 += digit;
        number = number / 10;//145

    }
    System.out.println(sum);
    System.out.println(Integer.parseInt(reversed1));

}
}


