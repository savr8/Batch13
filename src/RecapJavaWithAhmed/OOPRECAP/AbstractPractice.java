package RecapJavaWithAhmed.OOPRECAP;

public abstract class AbstractPractice {
//NOTE:you can create both abstract and regular method>examples below
public abstract void calculation();//you will override this and do your own implementation
public void calculation2(){
    System.out.println("calculated");//
}
protected abstract  void calculation3();//i can use different access modifiers for abstract methods
}
