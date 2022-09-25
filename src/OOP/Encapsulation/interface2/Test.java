package OOP.Encapsulation.interface2;

public class Test {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.run();//CanRun
        bird.fly();//CanFly
        bird.landing();//CanFly

        System.out.println("===============");
        Fish fish = new Fish();
        fish.swim();
        fish.diving();

        System.out.println("++++++++++++++++");
        Duck duck = new Duck();
        duck.diving();
        duck.fly();
        duck.run();
        duck.swim();

        Bird bird2 = new Bird();
        CanFly bird1 = new Bird();

        Duck duck1 = new Duck();duck1.swim();
        CanFly duck2 = new Duck();duck2.fly();//left side where to call methods from ,right side which type object you create
        CanFly bird3 = new Bird();bird3.fly();
        CanSwim duck3 = new Duck();
        CanRun duck4 = new Duck();

        //you can create an object in 3 ways
        /*
        Reference side can bethe same class as object class
        Reference side can be super class
        Reference side can be interface
         */





    }
}
