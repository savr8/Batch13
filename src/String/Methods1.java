package String;

public class Methods1 {
    public static void main(String[] args) {
        String name = "David";
// length() it will return numbersof characters from the string name
        int length=name.length();
        System.out.println(name);//print David
        System.out.println(length);//print 5
        System.out.println(name.length());//print 5

        name = name +" White";//David White

        System.out.println(name.length());//print 11

        //concat ();it will add given string value to the string

        name = name.concat("David White is not here");
        System.out.println( name   );

        int b = name.length();

        System.out.println( "the length of the new string is " + b);

        //charAt();-->takes an index number and returns the char at given index

       char letter = name.charAt(0);//at index 0 on the name -->D

        System.out.println(   letter);//print -->D

        name="Selenium";
      char letter2 =  name.charAt(2);//print L

        System.out.println(letter2);

        //task:find and store last letter from string -->i will do it anyway

      String text = "i will do it anyway";
      int lengthOfText = text.length();

        System.out.println(lengthOfText);

        char lastLetter = text.charAt(lengthOfText -1);//y

        System.out.println(lastLetter);

        System.out.println(text.charAt(text.length()-1));//y



    }
}
