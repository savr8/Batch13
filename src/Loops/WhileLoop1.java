package Loops;

public class WhileLoop1 {
    public static void main(String[] args) {
        // 10 times System.out.println("Sunday");
        int count = 0;

        while (count <= 10) {
            System.out.println(count+"-Sunday");
            count++;

        }
        System.out.println("This is the count after loop>>" + count);//count is 11

        while (count > 0) {
            System.out.println(count+".Morning");
            count--;

        }

        int number = 4;

      //  while (number==4){
//Blow loop is called infinite loop it will never stop since there is no condition update(it is always true)
          //  System.out.println("Study");

       // }

    }
}
