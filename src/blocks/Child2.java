package blocks;

import accsesModifiers.Person;

public class Child2 extends Person {
    public static void main(String[] args) {
        Person efe =new Person();
        efe.speakPublic();
        //efe.speakProtected;//default field/method cannot be reached out from different package
        Child2 efe2 =new Child2();
        efe2.speakProtected();
        efe2.speakPublic();
       // efe2.speakDefault();//default field/method cannot be reached out from different package
    }
}
