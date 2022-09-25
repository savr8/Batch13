package Loops;

public class BreakStatement {
    public static void main(String[] args) {
        OUTER:
        for (int i = 0; i < 3; i++) {
            INNER:
            for (int k = 0; k < 15; k++) {
                System.out.print(i + "<--i");
                System.out.println(k + "<--k");
                // break;it would terminate inner(nearest)loop
                if (k < 10 && k > 7) {
                    break;
                }
                System.out.println("Learning break statement");
                break OUTER;
            }
            System.out.println("*******************");
            //  break;->it would terminate larger loop
        }
    }
}
