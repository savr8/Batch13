package Ternary;

import java.util.Locale;

public class Practice2 {
    public static void main(String[] args) {
        String name1 = "Tectorial";

        String name2 = "Academy";

        String result = name1.contains(name2) ? name1.concat(name2) : name1 + " does not contain" + name2;

        System.out.println(name1.contains(name2) ? name1.concat(name2) : name1 + " does not contain" + name2);
        System.out.println(result);

        name1 = name1+name2;
     String result2 =result.equalsIgnoreCase(name1)? result.toUpperCase(Locale.ROOT) : name1.toUpperCase(Locale.ROOT);

        System.out.println(result2);
        System.out.println('a'>'b' ? 6.5 :"Zackry");
        int a =3,b=5;
        int x = ++a+ ++a + ++b;
        System.out.println(x>++a+b +b? a++: b++);
        System.out.println(x);//15
        System.out.println("true".equals(true)?"yes":"no");//no
        System.out.println(5==5? "Sunday":3>2?"Morning":"Afternoon");
        System.out.println(5!=5? "Sunday":3>2?"Morning":"Afternoon");
    }
}
