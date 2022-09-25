package RecapJavaWithAhmed.OOPRECAP;

public class EncapsulationPractice {
    private String name;
    private int age;

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
       if (age<0||age>100){
           System.out.println("Your age is in a range");
       }
        this.age = age;
    }



}
