package Ternary;

public class Practice1 {
    public static void main(String[] args) {

        int i = 5, j = 10;
        System.out.println(i < j ? "Hi" : "Buy");
        System.out.println(i < j ? i + j : j - i);
        System.out.println(i < j ? "Got it?" : i * j);
        //++++++++++++++++++++++++++++++++++++++++++++
        String result = i < j ? "Hi" : "Buy";
        int result1 = i < j ? i + j : j - i;
        //  i < j ? "Got it?" : i * j;/you can not store the result for this implementation
        //since options are having different data types

        System.out.println("Hi".equals(result));//true
        System.out.println(25>result1);//true
    }
}
