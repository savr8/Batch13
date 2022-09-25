package object;

public class TestCat {
    public static void main(String[] args) {
        Cat object = new Cat();
Cat cat =new Cat();
        object.name="Tom";
        object.breed="Britain";
        object.age=4;
        object.food=10;

        object.info();
        object.eat();
        object.sound();
object.walk("down");
     /*   System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.breed);
        System.out.println(object.food);

*/
        cat.walk("down");
        cat.setColour("Violet");
        System.out.println(cat.colour);
        cat.setColour("Orange");
        System.out.println(cat.colour);
        String catName= cat.getName();
        catName=catName.concat("White");
        System.out.println(catName);

    }
}
