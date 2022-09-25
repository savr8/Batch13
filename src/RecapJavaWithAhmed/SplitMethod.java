package RecapJavaWithAhmed;


import java.util.Arrays;

public class SplitMethod {
    /*
    INTERVIEW TASK:
    String str ="Hello java is so cool"
    1- Want you reverse this all words by itself
    olleH
    avaj
    si
    os
    looc
    TIPS==>Use nested loop
    TIPS2==>Use split method from spase:

        */
    public static void main(String[] args) {
        String str ="Hello java is so cool";
        String []words=str.split(" ");
        System.out.println(Arrays.toString(words));//this shwowing SPLIT METHOD is working
        for (int i =0;i<words.length;i++){//5 gets the WORD
            String reverse ="";

            for(int k=words[i].length()-1;k>=0;k--){//reverse the WORD
           reverse+=words[i].charAt(k);
            }
            System.out.println(reverse);
        }
    }
}
