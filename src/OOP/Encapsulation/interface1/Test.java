package OOP.Encapsulation.interface1;

public class Test {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.calculateArea();

        Square square = new Square();
        square.calculateArea();

        Shape t1 = new Triangle();
        t1.getPerimeter();

        Shape sq1 = new Square();
        System.out.println(">>" + sq1.calculateArea());

    }
}
