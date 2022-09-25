package object;

public class Math1 {
    /*

     */
    public void sum() {
        int a = 1, b = 2, sum = a + b;
        System.out.println("The sum of a and b is:" + sum);

    }

    public void sum1(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total is :" + total);
    }
    public void product(double number1, double number2){

        System.out.println("the product of "+number1+" and "+number2+" is "+(number1+number2));
    }
    public static void main(String[] args) {
        Math1 object = new Math1();
        object.sum();
        object.sum1(5, 8);
        object.sum1(13, 54);


    /*
    create the method that will take 2 double numbers
    this method will find the product of given numbers and shows it
     */



    }
}
