package RecapJavaWithAhmed;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

    /*
    POSSIBLE INTERVIEW QUESTIONS:once you start any explanation go with GENERAL to DEEP

    1-What is wrapper class?

    Wrapper Class--> it is a way(process)to convert data in to different form.
    -->Primitive-->OBJECT
    -->OBJECT-->PRIMITIVE

    2-Now many ways of wrapper class do you know?//Can you tell me AUTOBOXING and UNBOXING?

    AUTOBOXING:-->Primitive to Object-->it is a way to convert from Primitive to Object
    UNBOXING:-->Object to Primitive-->it is a way to convert from Object to Primitive

    3-Where do you use wrapper class in your project?

    I USE IT IN MY COLLECTIONS.

     */

    public static void main(String[] args) {
        //Collections store only OBJECTS

        //THIS IS AN EXAMPLE OF AUTOBOXING AND IT DOESN'T REQUIRE METHODS OR ENERGY FOR CONVERSION
        List<Integer> numbers = new ArrayList<>();
        int age = 30;//primitive data
        numbers.add(age);//PRIMITIVE->OBJECT(ONCE IT STRORES IN THE LIST THEN IT HAS OBJECT METHODS)
        numbers.add(age);
        System.out.println(numbers);

        //THIS IS AN EXAMPLE OF UNBOXING AND IT REQUIRES EXTRA METHODS OR ENERGY FOR CONVERSION(PARSING)
        String nmbr = "12";
        String nmbr2="3";
        //TASK :what is the multiplication fot nmbr and nmbr2
       // String value=nmbr*nmbr2;
        int number = Integer.parseInt(nmbr);
        int number2 = Integer.parseInt(nmbr2);
        int multi = number*number2;
        System.out.println(number+" number");
        System.out.println(multi+" multi");



        //STRING VALUE OF:-->IS NOT A WRAPPER CLASS
        // STRING VALUE OF:-->IS NOT WRAPPER CLASS.***IT SEEMS IT IS AUTOBOXING BUT IT IS NOT***

        //WHENEVER YOU NEED TO MANIPULATE DATA,YOU SHOULD USE STRING VALUE OF

        int numberOfStudents = 1230;
        String id = String.valueOf(numberOfStudents);
        String id2 = numberOfStudents + "";
        System.out.println(id);

    }

}
