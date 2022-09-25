package exceptions;

public class Practice1 {
    public static void main(String[] args) {
        String str = "Last day";
        //  System.out.println(str.charAt(20));
        System.out.println("Hello World");
        String str1 = "13B";
        try {
            // task=
            // convert this given string to integer if possible!!
            System.out.println(str1.charAt(15));
            Integer.parseInt(str1); // NumberFormatException
        } catch (NumberFormatException exception) {
            System.out.println("This is catch block for 'NumberFormatException'");
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Catching String Index Out Of Bound Exception");
        }
        try {
            Integer.parseInt(str1); // NumberFormatException

        } catch (NumberFormatException exception) {
            System.out.println(" 2 This is catch block for 'NumberFormatException' 2");
        }
        System.out.println("HELLO WORLD 2");
    }
}
