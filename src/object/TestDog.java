package object;

public class TestDog {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.initialize("Husky", "King", "Grey");
        dog1.eat();
        dog1.eat();
        Dog dog2 = new Dog();
        dog2.initialize("PitBull", "Baddy", "Black");
        dog2.eat();
        dog2.eat();
        dog2.eat();
        System.out.println(dog1.food);
        System.out.println(dog2.food);
        System.out.println(dog1.name);
        Dog dog3 = new Dog();
        dog3.food=30;
        System.out.println(dog1.food);
        System.out.println(dog2.food);
        //calling static play()method with object
        dog3.play("Basement");
//calling static play () method by using class name
        Dog.play("Park");
        System.out.println("==============");
        System.out.println(dog3);
        System.out.println(dog1);
    }
}
