package OOP.Encapsulation.abstract1;

public class Test {
    public static void main(String[] args) {
        //you cannot create object from abstract class
        //Student student = new Student();
        OnlineStudent onlineStudent = new OnlineStudent();

        System.out.println(onlineStudent.watch("weekday"));
        System.out.println(onlineStudent.name);

        Alex alex = new Alex();
        System.out.println(alex.name);
        System.out.println(alex.age);
        OnlineOlga onlineOlga = new OnlineOlga();
        onlineOlga.eating();
        System.out.println(onlineOlga.watch("weekend"));

        onlineOlga.questions(5);

        //refence is parent ,object is child type
        OnlineStudent olga = new OnlineOlga();

        System.out.println( ">>>>>>"+olga.watch("weekend"));

        Student student= new OnlineOlga();
        System.out.println("****"+student.watch("weekend"));


    }

}




