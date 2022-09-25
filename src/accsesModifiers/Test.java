package accsesModifiers;

public class Test {
    public static void main(String[] args) {
        //testing access in same package different class
        Person sam = new Person();
        sam.ageProtected= 32;
        sam.speakProtected();

        sam.higthDefalt=6;
        sam.speakDefauil();

      //  sam.genderPrivate


    }
}
