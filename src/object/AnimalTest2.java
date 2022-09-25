package object;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AnimalTest2 {
    public static void main(String[] args) {
        Animal bird = new Animal();
        System.out.println(bird.colour);
        bird.name = "Tweeter";
        bird.sleep();
        Animal cat = new Animal();
        cat.name = "Tom";
        cat.sleep();
        String nameOfCat = cat.name;
        cat.sleep();
        Animal eagle = new Animal();


        eagle.name = "Speedy";

        System.out.println(eagle.name);
        bird.run();
        eagle.run();
        System.out.println(cat.energy);
        cat.run();
        //whats energy of eagle?//60,90,100
        System.out.println("Cats energy"+cat.energy);
        System.out.println("Eagle energy>"+eagle.energy);

        eagle.sleep();
        System.out.println(eagle.energy);

        eagle.printInfo();//will print eagles info
        System.out.println("============");
        cat.printInfo();

        System.out.println("======================");
        bird.sleep();
        System.out.println("===================");


    }

}
