package object;

public class Door {
    String color;
    String shape;
    // behavior of door?(method)
    public static void open() {
        System.out.println("Door is opening");
    }
    public static void open(int inches) {
        System.out.println("******" + inches);
    }
    // Constructor
    public Door() {
        System.out.println("NO argument CONSTRUCTOR");
    }
    // Constructor
    public Door(String color) {
        this.color = color;
        System.out.println("ONE argument(color) CONSTRUCTOR");
    }
    //Constructor
    public Door(String shape, String color){
        this.shape = shape;
        this.color=color;
        System.out.println("Two argument CONSTRUCTOR");

    }
    public static void main(String[] args) {
        open();
        open(10);
        Door door1 = new Door();
        Door door2 = new Door("White");
        door1.color = "Brown";
        door1.shape = "Rectangle";
        System.out.println(door1.color);
        Door door3 = new Door("Gray");
        Door door4 = new Door("triangle","Black");
        System.out.println( door4.shape );
    }

}
