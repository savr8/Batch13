package RecapJavaWithAhmed;

import java.util.Arrays;
import java.util.Locale;

public class StringAndMethods {
    /*
    POSSIBLE INTERVIEW QUESTIONS:ALSO IMPORTANT FOR AUTOMATION
    1-Most of the technical questions are related with STRING
    2-What is the difference between.equals and ==?

Firstly,both of them are used for comparison.
*Whenever you see.equal method(it always compares the VALUES of the objects).***
*Whenever yoe see "=="-->it always compares the LOCATION of the objects.(BE CAREFUL WITH TWO DIFFERENT OBJECTS)
NOTE*WHEN you see "NEW"key word,it means they have different location spot in HEAP memory.

    AUTOMATION:
    1-->.trim
    2-->.equals
    3-->equalIgnoreCase
    4-->contains
    5-->substring
    6-->toUpper/toLower
    7-->replace

    **String is an none primitive object
       How can we declare String object?

       -String name ="Ahmet";-->String pool--> Heap Memory
       -String name2 =new String("Ahmet");-->Heap memory



     STRING METHODS:
     1-charAt-->it gives you a character of the String.It returns char
     2 -indexOf -->it gives you index of character.It returns int
     3 -startsWith -->it checks the word either it starts with the specific character or not.It returns boolean
     4-endsWith -->it checks the word either it ends with the specific character or not.It returns boolean
  /4   5- contains-->it checks the words contains the specific character or not.It returns boolean
  /5   6-substring-->it is a way to get specific part of a String.It returns a String
 /2    7 -equals -->it compares the value of the variable.It returns boolean
 /6    8-ToLower/ToUpper -->it makes the characters to upper or lower case.It returns String.
 /3    9-EqualIgnoreCase -->it is a way to compare the values(2 values)without any sensitiveness(doesnt care about upper or lower case)
     10 - split-->it is awy to split(separate)the string from specific spot.("").**IT RETURNS STRING ARRAY**
     11- length -->it gives you the size(length) of the String.it returns int
     12-concat-->it is a way to connect String together.It returns String.
 /7    13-replace-->it is a way to replace the specific character/s with the new that you provide.It returns String
 /1    14-trim-->It is great method to remove space from beginnung and end.**AUTOMATION PURPOSES**
 */
    public static void main(String[] args) {
        String str="ahmet loves java";
        String str1 = new String("ahmet loves java");
        String str2 = "ahmet loves java";
        String str3 = new String("ahmet loves java");

        System.out.println(str.equals(str1));//true-->it checks the value
        System.out.println(str==str1);//false-->it checks the location of the value
        System.out.println(str==str2);//true-->same object and same location
        System.out.println(str1==str3);//false they are two different object, location spot is different
        System.out.println(str1.equals(str3));//true checks the value

        String []words=str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words);
        System.out.println( str.charAt(0));//a
        str.charAt(0);
        str.substring(0,1).toUpperCase(Locale.ROOT);//the reason im using substring you can manipulate the data
        //after you use substring.It is generally compared with charAT,but charAt doesn't have any methods.
        System.out.println(str.substring(0,1).toUpperCase(Locale.ROOT));


    }
}
