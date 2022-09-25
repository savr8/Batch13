package object;

public class AreaCalculator {
    //square calculator
    public void areaCalculator(int length) {

        int areaOfSquare = length * length;
        System.out.println("The area of Square is:" + areaOfSquare);
    }

    //overLoading areaCalculator method to calculate area of rectangle
    public void areaCalculator(int length, int width) {
        int areaOfRectangle = length * width;
        System.out.println("Area of rectangle is:" + areaOfRectangle);
    }

}