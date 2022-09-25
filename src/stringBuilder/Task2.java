package stringBuilder;

public class Task2 {
    /*

     * create a method that will take a StringBuilder as parameter
     * this method will find the sum of numbers from given StringBuilder
     * show the sum ! make sure it is correct sum !
     *  dfaWE+-2-l&^--4[+5 --> 2 + 4 + 5 => 11
     */

    public static void findSum(StringBuilder builder) {
        int sum = 0;

        for (int i = 0; i < builder.length(); i++) {
            if (Character.isDigit(builder.charAt(i))) {

                // sum+= Integer.parseInt(""+ builder.charAt(i));
                sum += Integer.parseInt(String.valueOf(builder.charAt(i)));//same thing
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("asdfer111 ");
        findSum(b);
    }


}
