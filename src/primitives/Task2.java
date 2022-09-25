package primitives;

public class Task2 {
    public static void main(String[] args) {
        /*
        delivery fee
        if the location in the range of 10 miles or less,delivery fee will be$5.99
        otherwise delivery fee will be 10.99
        if large pizza is 17.99 and your location is 10 miles away from the store
        -calculate and print total payment
        ?-sinse my location is 10 miles range
        print that are paying less delivery fee?
        true or false

         */

        double deliveryFee1=5.99;
        double  deliveryFee2 = 10.99;

        double largePizza=17.99;
        double total =deliveryFee1+largePizza;
        System.out.println("total coast"+ total);

        int locationMiles =10;
        int limit =10;
        boolean paylessOrNot1 = limit>=locationMiles;
        boolean paylessOrNot2 = limit<=locationMiles;
        System.out.println("You are paying less delivery fee"+paylessOrNot1);
        System.out.println("You are paying less delivery fee"+paylessOrNot2);




    }
}
