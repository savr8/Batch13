package Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        use nested for loop to create multiplication table for numbers 1 to 5
        1*1=1
        1*2=2
        .........................
        1*10=10
        2*1=2
        2*2=4
        2*10=20
       ......  3*1=3.
        3*2=6
         3*10=30
         you want to skip table for 2's
         */
        for (int num1 = 1; num1 <= 5; num1++) {
            if(num1==2||num1==4){
                continue;
            }

            for (int num2 = 1; num2 <= 10; num2++) {

                System.out.println(num1 + "*" + num2 + "=" + num1 * num2);

            }
        }
    }
}
