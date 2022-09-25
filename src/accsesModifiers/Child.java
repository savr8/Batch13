package accsesModifiers;

public class Child extends Person {

    public static void main(String[] args) {
        Person mustafa=new Person();
        mustafa.speakPublic();
        mustafa.speakProtected();
        mustafa.speakDefauil();

        Child child=new Child();
        child.speakPublic();
        child.speakDefauil();
        child.speakProtected();



    }

}
