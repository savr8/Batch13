package String;

public class StringBasic {
    public static void main(String[] args) {

        System.out.println("*Sunday*");

        String word = "Tuesday";
        System.out.println(word);;//Tuesday

        String name = new String("David");
        System.out.println(name);//David

        System.out.println(word + name);
        word = name + " Souza";
        System.out.println(word);//David Souza
        System.out.println("+++++++++++++++++++++");
        System.out.println(name +" Souza");//David souza
        System.out.println(name);//David

        System.out.println(name +55);//David55
        System.out.println(name + 6+7);//David67
        System.out.println(6+7 + name);//13David

        String result = name +" Brown ";

        System.out.println(result);//David Brown

        result += result;//
        System.out.println(result);//David BrownDavid Brown
 //String is immutable(unchangeable),unless you reassing a new value or do concatenation(adding extra text/String to it)
        result = result +"Monday";
        System.out.println(result);

        String flower = "Rose";
        System.out.println(flower);//Rose
        flower = flower.concat(" is Red");
        System.out.println(flower);//Rose is Red

        System.out.println(flower.concat(" and beautiful"));
        System.out.println(flower);//Rose is Red

        int number =5;//Primitives do not have methods/function but OBJECTS have behavior/function

        String number1="1";
        number1 +="2";
        number1+=2;
        System.out.println(number1);//122


    }
}
