package RecapJavaWithAhmed.OOPRECAP;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class Exceptions {
    /*
    POSSIBLE INTERVIEW QUESTIONS
    1-How do you handle the exceptions?
    I can handle exception with try and TRY AND CATCH BLOCK or THROWS

    2- Can you use more than once catch block?how about try block?
   NO you cannot use more than one try block.but you can use as many as catch block as you want

    3-What do you about final,finally,finalize?
  1-  -->FINAL-->It is a way to make your method or variable final statement(last statement)
    ->not changeable ->static{FINAL STRING NAME="BANK OF AMERICA"}

  2-  -->FINALLY -->it is a block that comes after try and catch to show final execution.finally
    {"HAVE A GREAT DAY"}->when i close my database connection i use it.

 3-   -->FINALIZE-->it is a method which works with GC(garbage collector)to make sure it is working manually.

    4- Throw and throws?
    BOTH TROW and THROWS are the concepts of the exception handling in which throws an exception from method or any block of code
    ***THROWS are used in the signature of the method to indicate that this method might throw one of the exception.
   ***THROW is used in the block of code or methods.
     */
    public static void main(String[] args) {
        final String name = "Bank of America";
        try {

            String number = "353a";

            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += Integer.parseInt(number.charAt(i) + "");
            }
            System.out.println(sum);
        } catch (NumberFormatException ex) {
            System.out.println("Thre is an NumberFormatException");
        } catch (IndexOutOfBoundsException in) {
            System.out.println("There is an IndexOutOfBoundsException");
        } finally {


        System.out.println("Thre are no any problem with exeption");
    }

}}
