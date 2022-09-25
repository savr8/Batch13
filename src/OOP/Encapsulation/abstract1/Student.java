package OOP.Encapsulation.abstract1;

public abstract class Student {
    String name;
    int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //this is abstract study method
    public abstract void study();
    //this is abstract study method
    public abstract Integer watch(String day);

    //this is regular (non-abstract method)
    public void eating(){
        System.out.println(name+ " is eating");
    }

}
