package blocks;

import accsesModifiers.Person;

public class AccessModifierTest {
    public static void main(String[] args) {
        //testing access in different package
        Person jonny = new Person();
        jonny.namePblic="John";
        System.out.println(jonny.namePblic);
        jonny.speakPublic();


    }
}
