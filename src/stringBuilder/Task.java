package stringBuilder;

public class Task {
    /*\
    ==TASK==
    *create a new Package -->nameit as stringBuilder
    create a new class stringBuilder package-->nameit as:>Task
    write java code to print lower case letters of alphabet by separating camma
    write java code to print upper case letters of alphabeth as a single String value

     */

    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + ',');
        }
        System.out.println();
        String word = "Test";
        System.out.println(word);

        String str = "";

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            str = str + ch;
            System.out.println(str);
        }
        System.out.println(">>"+str);
        System.out.println("12345678");
        System.out.println(str);

    }
}
