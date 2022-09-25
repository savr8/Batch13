package stringBuilder;

public class Task3 {
    /*
    s-e-l-e-n-i-u-m
    remove dashes from given stringBuilder
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder(" s---e--l--e---n--i--u--m");
        deleteDash(stringBuilder);
    }
    public static void deleteDash(StringBuilder builder) {

        for (int i = 0; i < builder.length(); i++) {
            if ('-' == builder.charAt(i)) {
                builder.deleteCharAt(i);
                System.out.println(builder);
                i--;
            }
        }
        System.out.println(builder);
    }

}
