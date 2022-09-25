package RecapJavaWithAhmed;

public class ConstructorPracticeHuman {
    //instance variables
    int age = 30;
    String name = "Ahmet";
    double height = 6.2;
    String eyeColor = "Brown";

    double amountOfMusles = 45.5;
    String lastName;

    public ConstructorPracticeHuman() {//ZERO ARGUMENT CONSTRUCTOR

        System.out.println("this is my default constructor ");
    }


    public ConstructorPracticeHuman(int age, String name, double height, String eyeColor, double amountOfMusles, String lastName) {
        //6 ARGUMENT CONSTRUCTOR
        this.age = age;
        this.name = name;
        this.height = height;
        this.eyeColor = eyeColor;
        this.amountOfMusles = amountOfMusles;
        this.lastName = lastName;

    }

    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println("My kid's name is " + this.getName());
    }

    public void printInformation() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(height);
        System.out.println(eyeColor);
        System.out.println(amountOfMusles);
        System.out.println(lastName);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("your garbage collector worked");
    }

    public static void main(String[] args) {
        ConstructorPracticeHuman constructorPracticeHuman = new ConstructorPracticeHuman();
        constructorPracticeHuman.printInformation();
        ConstructorPracticeHuman male = new ConstructorPracticeHuman(25, "Ratata", 7.6, "green", 20.5, "tatata");
        male.printInformation();

        ConstructorPracticeHuman female = new ConstructorPracticeHuman(26, "Anna", 5.6, "blue", 20.3, "never");
        female.printInformation();

        ConstructorPracticeHuman kids = new ConstructorPracticeHuman(5, "Rtana", 2.1, "brown", 5, "merata");
        kids.printInformation();
        kids.getName();
        System.out.println("my kids age is " + constructorPracticeHuman.getName());
     //male=female;
       // female=null;
       //male = null;

        System.gc();
    }
}

