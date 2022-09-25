package Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        LABEL:

        for (int i = 0; i < 9; i++) {

            if(i==5){
                continue ;
            }

            INNER:
            for (int k = 0; k < 15; k++) {

                if (k > 5 & k < 10) {
                    continue LABEL;
                }

                System.out.print(i + "<--i    ");
                System.out.println(k + "<--k ");
                // break;it would terminate inner(nearest)loop
                if (k < 10 && k > 7) {
                    break;
                }
                System.out.println("Learning break statement");


            }
            System.out.println("*******************");
            //  break;->it would terminate larger loop
        }
    }
}
