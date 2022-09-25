package exceptions;

public class Prctice2 {
    public static void main(String[] args) {


    String str ="13B";
    try{
        System.out.println(str.charAt(21));
        Integer.parseInt(str);
    }catch (RuntimeException runtimeException){
        System.out.println("Single catch with parent type of exeption");
    }

}}
