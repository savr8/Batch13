package String;

import java.util.Locale;

public class ChainingPractice {
    public static void main(String[] args) {
        String str = " Sunday is good day to learn ";
        //use multiple method one after other

     boolean b1 = str.replace('o','*')
     .substring(str.indexOf('i')).trim().toUpperCase(Locale.ROOT).contains("xxx");
        System.out.println(b1);

        boolean b2 = str.replace('o','*')
                .substring(str.indexOf('i')).trim().toUpperCase(Locale.ROOT).contains("SUNDAY");
        System.out.println(b2);
        boolean b3 = str.replace('o','*')
                .substring(str.indexOf('i')).trim().toUpperCase(Locale.ROOT).contains("LEARN");
        System.out.println(b3);
   }
}
