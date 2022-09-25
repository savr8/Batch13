package String;

public class Methods4 {
    public static void main(String[] args) {
        String item = "!!!!!!!!!!!!microphone";
        //substring(),return string() return partial string from given index
        String part1 = item.substring(5);

        System.out.println(part1);
        //how to cut/take part of the string in the middle section not all the way to the end
        String part2 =item.substring(0,5);
        System.out.println(part2);
        //take phone from the string "microphone"but provide index number dynamically
        System.out.println(item.substring(item.indexOf("ph")));//

        //contains(),return type is boolean

       boolean result = item.contains("mic");

        System.out.println(result);
        //!!!!!!!!!!!!microphone
        System.out.println(item.contains("Phone"));//false

        System.out.println(item.contains("!!!!!!!!!!!!microphone"));//true

        System.out.println(item.contains("c"));//true

        //trim(),it will delete heading and trailing spaces

        String day=" Sunday is good day to learn ";

        System.out.println(day);

     String  day5 = day.trim();
        System.out.println(day5);
    }
}
