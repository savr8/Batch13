package RecapJavaWithAhmed.OOPRECAP;

public class AbstractPractice2 extends AbstractPractice {//concrete class
    //TO BE ABLE TO ACCESS OTHER CLASS DATA
    //1-I CAN CREATE AN OBJECT OR I CAN EXTEND MY CLASS
    public static void main(String[] args) {
    //    AbstractPractice abstractPractice= new AbstractPractice();
    }

    @Override
    public void calculation() {
        System.out.println("calculation");
    }

    @Override
    protected void calculation3() {
        System.out.println("Hello");
    }
}
