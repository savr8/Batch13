package accsesModifiers;

public class Person {
    //publi,protected,default,private
    public String namePblic;
    protected int ageProtected;
    private String genderPrivate;
    double higthDefalt;

    public void speakPublic() {
        System.out.println("Speaking Public");
    }

    protected void speakProtected() {
        System.out.println("Speaking Protected");
    }

    void speakDefauil() {
        System.out.println("Speaking Default");
    }
    //which access modifier is not meaningful to give for a Constructor

    public Person() {

    }

    private void speakPrivate() {
        System.out.println("Speaking Private");
    }

    public static void main(String[] args) {
        //testing access in the same class
        Person bob = new Person();
        bob.namePblic = "BOB";
        bob.ageProtected = 21;
        System.out.println(bob.ageProtected);
        bob.speakProtected();

        bob.higthDefalt=5;
        bob.speakDefauil();

    }
}
