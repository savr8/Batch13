package object;

public class TaskFlower {
    public boolean correctFlower(Flower flower) {

        if (flower.size.equalsIgnoreCase("large") && flower.price > 10) {

            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Flower anyFlower = new Flower("Rose", "large", "red", 15);
        Flower anyFlower2 = new Flower("Rose", "large", "red", 9);

        TaskFlower taskFlower = new TaskFlower();

        Boolean thisIsTheFlowerYouAreLookingFor = taskFlower.correctFlower(anyFlower);


        System.out.println(thisIsTheFlowerYouAreLookingFor);

        boolean r2 = taskFlower.correctFlower(anyFlower2);
        System.out.println(r2);
    }
}

