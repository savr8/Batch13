package String;

import java.util.Locale;

public class MetodTask3 {
    public static void main(String[] args) {
        /*
        String str="   One to HERO
        change one to ZERO
        make all string upper case
        remove all spaces
        get only first three characters
        and print those 3 chars
         */
        String str = "    One to HERO   ";
       String part = str.replace("One ","ZERO").toUpperCase(Locale.ROOT).trim().replace(" ","").substring(0,4);

        System.out.println(part);

        System.out.println(str);
        System.out.println(str.replace("One","ZERO"));


    }
}
