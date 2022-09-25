package OOP.Encapsulation.abstract1;

public abstract class SelfLearner extends Student{

    public SelfLearner(String name,int age){
        super("SELF",1);
    }

    public void study(){
        System.out.println("Self learner is studyng");
    }
    public abstract void goToLibrary();

    //abstract methods cannot be private
  //  private abstract void party();

}
