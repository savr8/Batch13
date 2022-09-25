package OOP.Encapsulation.interface2;

public class Duck extends CanRun implements CanFly, CanSwim {
    public void fly() {
        System.out.println("Duck is flying");
    }
    public void run(){
        System.out.println("Duck can run");
    }

    public void landing() {
        System.out.println("Duck is landing");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }

    public void diving() {
        System.out.println("Duck is diving");
    }

    public void speeding() {
        System.out.println("Duck is speeding!");
    }
}
