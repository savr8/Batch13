package arrayList;

public class Car {

    String brand;
    String model;
    String color;
    int year;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public  Car(String brand,String model,String color,int year) {
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year=year;
    }
}
