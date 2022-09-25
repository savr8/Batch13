package Loops;

public class WhileLoop6 {
    public static void main(String[] args) {

        String word = "Watermelon";
        //print out every single separated by comma
        //W,a,t...
        int indexNumber = 0;
        while (indexNumber < word.length()) {
            System.out.print(word.charAt(indexNumber) + ",");
            indexNumber++;
        }
        //print the letters of the string from end to the beginning
//Summer -->r,e,m,m,u,S

        String word1 = "Summer";
        int i = word1.length() - 1;
        while (i >= 0) {
            System.out.print(word1.charAt(i) + "<-");
            i--;
        }

    }
}
