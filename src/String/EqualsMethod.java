package String;

public class EqualsMethod {
    public static void main(String[] args) {
        String name1 = new String("David");
        String name2= new String("David");

        String name3 = "David";
        String name4 ="David";
        String name5 = name1;

        System.out.println(name1.equals(name2)   );//true
        System.out.println(name3.equals(name4)   );//true
        System.out.println(name1 == name2);//false ,different objects not the same
        System.out.println(name3 == name4);//true the same value,from string pool
        System.out.println(name1.equals(name4));//true
        System.out.println(name1 == name4);//false
        System.out.println(name5.equals(name1));//true
        System.out.println(name5==name1);//true

        //equals -->look for the values
        //== -->look if they are the same object or not(if they are in the string pool with same value,it will also return "true")

    }
}
