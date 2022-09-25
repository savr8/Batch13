package Loops;

public class NestedForLoop1
{
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            for (int k=0;k<5;k++){
                System.out.print(i+"<--i");
                System.out.println(k+"<--k");
                break;//it would terminate inner(nearest)loop
          //      System.out.println("hi");->compile time error
            }
            System.out.println("*******************");
          //  break;->it would terminate larger loop
        }
    }
}
