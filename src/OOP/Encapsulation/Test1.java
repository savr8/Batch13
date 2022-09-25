package OOP.Encapsulation;

public class Test1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Cayonne",2023,"Poeche");
        vehicle.start();
        System.out.println(vehicle.model);//

         Object o = vehicle.accelerate();

        System.out.println(o);
        System.out.println("-----------------");
        Car car = new Car();
       Integer number= car.accelerate();
        System.out.println(number+1);

        System.out.println(vehicle.model);

        Vehicle v2 = new Vehicle("CRV",2021,"Honda");
        System.out.println(v2.model);
        System.out.println(vehicle);


    }
}
