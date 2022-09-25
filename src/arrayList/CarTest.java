package arrayList;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void blueCars(List<Car> cars) {

        for (Car myCar : cars) {
            if (myCar.color.equalsIgnoreCase("Blue")) {
                System.out.println(myCar.brand + " " + myCar.model + " is a blue car");
            }
        }

    }

    public static void redCars(List<Car> cars){

        for (Car myCar : cars) {
            if (myCar.color.equalsIgnoreCase("red")) {
                System.out.println(myCar.brand + " " + myCar.model + " is a blue car");
            }
        }
    }
    public static void example(ArrayList example){
        for(Object o :example){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A8", "Red", 2022);
        Car car2 = new Car("BMW", "X5", "Black", 2023);
        Car car3 = new Car("Honda", "CRV", "Blue", 2020);
        Car car4 = new Car("Lexus", "NX300", "Blue", 2019);


        List<Car> inventory = new ArrayList<>();
        inventory.add(car1);
        inventory.add(car2);
        inventory.add(car3);
        inventory.add(car4);

        blueCars(inventory);
        redCars(inventory);

        System.out.println("=====================");


        //not passing object type to store in the arraylist
        ArrayList list = new ArrayList<>();
        list.add("Dima");
        list.add(car1);
        Integer[] numbers ={1,2,3};
        list.add(numbers);
        System.out.println(list);

    }

}
