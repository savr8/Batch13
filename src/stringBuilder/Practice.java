package stringBuilder;
import java.util.*;
import java.util.Arrays;



import java.util.Arrays;
    public class Practice {
        public static void main(String[] args) {
            StringBuilder builder = new StringBuilder();
            // builder = "Example"; // compile time error
            StringBuilder builder1 = new StringBuilder("Test");
            StringBuilder builder2 = new StringBuilder();
            // append();
            System.out.println(builder2);
            System.out.println("------------");
            builder2.append("Saturday");
            System.out.println(builder); //
            System.out.println(builder1); // Test
            System.out.println(builder2); // Saturday
            String str = "Sunday";
            str.concat(" morning");
            str.concat(" java classes is happening now.");
            System.out.println(str);
            builder2.append(" is over");
            System.out.println(builder2); //
            builder2.append(true);
            builder2.append('x');
            builder2.append(123456);
            builder2.append(false).append("you can do more");
            System.out.println(builder2);
            int[] nums = {1, 2, 3};
            builder2.append(Arrays.toString(nums));
            System.out.println(builder2);
            // charAt()
            Character firstLetter = builder2.charAt(0); // auto boxing allow us to assign returned primitive char as object Character
            System.out.println(firstLetter);
            // Saturday is overtruex123456falseyou can do more[1, 2, 3]
            //indexOf()
            int index = builder2.indexOf("[1,");
            System.out.println(index);
            Integer i = builder2.indexOf("i");
            System.out.println(i);
            // length()
            System.out.println(builder2.length());
            // substring
            System.out.println(builder2.substring(index));
            String part = builder2.substring(index);
            System.out.println(part);
            System.out.println(part.equals(nums));
            String str2 = "[1, 2, 3]";
            System.out.println(part.equals(str2));
            System.out.println(part == str2);
            System.out.println("++++++++++++++");
            System.out.println(builder1 == builder2); //
            System.out.println(builder1.equals(builder2));//
            StringBuilder b4 = new StringBuilder("Test");
            System.out.println(builder1.equals(b4)); //
            b4.append(str2);
            b4.append(builder2);
            System.out.println(b4);
            String dayPart = b4.substring(b4.indexOf("S"), (b4.indexOf("y") + 1));
            System.out.println(dayPart);
        }}