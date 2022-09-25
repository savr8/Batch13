package stringBuilder;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Good morning");

        //insert
        builder.insert(0,"Hi ");
        System.out.println(builder);
        //Hi Julia,Good morning
        builder.insert(builder.indexOf(" ")," Julia,");
        System.out.println(builder);
        //insert String[] to the index right before 'G'
        String [] array={"How","is","everything?"};
        builder.insert(builder.indexOf("G"), Arrays.toString(array));
        System.out.println(builder);

       // insert a boole to the builder object

        builder.insert(2,true);
        System.out.println(builder);

        //delete
        System.out.println(builder.charAt(5));
        builder.delete(2,6);
        System.out.println(builder);

        //delete entire array part of the builder object

        System.out.println(builder.delete(builder.indexOf("["),builder.indexOf("]")+1 ));

        builder.deleteCharAt(8);
        System.out.println(builder );

        builder.delete(14,1000);//
        System.out.println(builder);

        //builder.delete(25,100)//StringIndexOutOfBoundExeption

        //replace
        builder.replace(5,7,"**");
        System.out.println(builder);
        builder.replace(builder.indexOf("o"), builder.indexOf("d"),("$$") );
        System.out.println(builder);

        //reverse

        builder.reverse();
        System.out.println(builder);
        String str ="Java";
        StringBuilder builder1 = new StringBuilder(str);
        builder1.reverse();
        System.out.println(builder1);


    }
}
