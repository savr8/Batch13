package RecapJavaWithAhmed.OOPRECAP;

public class InheritanceChild extends Inheritance {
    String name;
public InheritanceChild(String name){
   super();
   super.age=12;
    this.name=  name;
}
    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        //inheritance.
        InheritanceChild inheritanceChild=new InheritanceChild("ahmet");
        //inheritanceChild.
    }
    //NOTE:When you create a child class with EXTEND KEYWORD.You can access
    //the parent variables and methods either directly from object OR
    //YOU CAN USE SUPER KEY WORD TO ACCESS THEM
    //NOTE2=>ONCE YOU CREATE A CHILD CLASS,IF YOU ARE CREATING A CONSTRUCTOR that
    //parent has but not child,then YOU NEED TO USE SUPER().
}
