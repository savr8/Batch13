package Loops;

public class WhileLoop2 {

    public static void main(String[] args) {

    /*

    your age is 21
    create while loop
    -->print my age is ...age..till your age gets to 30 (included)
     */
        int age = 21;
        while (age <= 30) {
            int zipcode = 123;//zipcode is local veriable and it can be used in the same block only
            System.out.println("my age is:" + age);
            age++;
            System.out.println("Zip code:" + zipcode);

zipcode++;
        }
        //  System.out.println(zipcode);since zipcode is local veriable you cannot use it it out of the above block


    }
}
