package OOP.Encapsulation.interface1;

public class Square implements Shape {

    int sideCount = 4;

    public Number calculateArea() {
        return sideCount * sideCount;
    }

    public void getPerimeter() {
        System.out.println("Perimeter of square is:" + 4 * 4);
    }


}
