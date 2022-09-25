package RecapJavaWithAhmed.OOPRECAP;

public class Inheritance {
    /*
    POSSIBLE INTERVIEW QUESTIONS
    1-What do you know about inheritance and how do you inherit two classes?
    *Inheritance is a way to make a connections(relationship)between classes
    */
    String name;
    int age;
    String country;
public Inheritance(String name,int age){
    this.name=name;
    this.age= age;

}
    public Inheritance(){//empty contructor

    }

    public Inheritance(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void printCountry(){
        System.out.println("my country is "+getCountry());

    }



}
