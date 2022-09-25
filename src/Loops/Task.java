package Loops;

public class Task {
    public static void main(String[] args) {
        /*
        String str="tR4#y7!";

        count and print number of letters,digits and other symbols from other String

        "There are ... number of letters"
        "There are ...number of digits"
        "There are ..number of other symbols
         */

        String str = "tR4#8y7@!$2&";//index start with 0

        int indexNum = 0;
        int letterCount = 0;
        int digitCounter =0;
        int symbolCounter=0;
        while (indexNum < str.length()) {
            char ch = str.charAt(indexNum);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                letterCount++;
            } else if (ch>='0'&& ch<='9') {
                digitCounter++;
            }
            else{
                symbolCounter++;
            }
            indexNum++;
        }
        System.out.println("There are "+letterCount+" number of other letters");
        System.out.println("There are "+digitCounter+" number of other digits");
        System.out.println("There are "+symbolCounter+" number of other symbols");
    }

}
