package OOP.Encapsulation.interface2;

public interface CanFly {
    int WINGS=2;
    int TAIL =1;

    void fly();
    void landing();
    default void speeding(){
        System.out.println("This is default method in CanFly");
    }


}
