package String;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;
import java.util.SplittableRandom;

public class Methods3 {
    public static void main(String[] args) {
        String text = "Do whatever IT takes to be successful";
        //to lowerCase(),returns tring
        text = text.toLowerCase(Locale.ROOT);
        System.out.println(text);
        text= text.toUpperCase(Locale.ROOT);
        System.out.println(text);
        System.out.println(text.toLowerCase());

        //startWith();endsWith();returns true/false


        boolean r1=text.startsWith("d");
        System.out.println(r1);
        boolean r2=text.startsWith("DO");
        System.out.println(r2);
        boolean r3=text.startsWith("TAKES");
        System.out.println(r3);
        boolean r4 = text.endsWith("UL");//true
        System.out.println(r4);
        System.out.println(text.endsWith("DO WHATEVER IT TAKES TO BE SUCCESSFUL"));

        //equals(),equalsIgnorecase(),return boolean TRUE/False

        String str1= "Red";
        String str2 = "RED";
        boolean areSame = str1.equals("red");
        System.out.println(areSame);

        System.out.println(str1.equals("ed"));
        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str2.toLowerCase()));

        System.out.println(str1.toUpperCase()== str2);

        System.out.println(str1.equalsIgnoreCase("RED"));//true

        str1 =str1.toUpperCase();

        System.out.println(str1.equals(str2));//true
        System.out.println("======================");
        String language ="java";

        //replace(),char,char//string,string

     String newLanguage = language.replace('v','x');

        System.out.println(newLanguage);
        System.out.println(newLanguage.replace('x','v'));
        System.out.println(newLanguage);
        System.out.println("=================");
        System.out.println(language.replace('y','*'));
        System.out.println(language.replace('a','$'));//all 'a' will be replaced with $

        language =language.replace("va","da");
        System.out.println(language);
        System.out.println(language.replace("da","yes"));
        System.out.println(language.replace("jada","English"));
        System.out.println(language.replace("d"," i like this replacement method"));
       language= language.replace("d","v");
        System.out.println(language);
    }
}
