package object;

public class Dog {
    String breed;
    String name;
    String color;
   static int food=20;

    /*
    * create method to initialize all variables except food
    * */

    public void initialize(String breed1,String name1,String color1){
        breed=breed1;name=name1;color=color1;

    }
    /*
    * create a method(eat) that will print "..name..is eating food.New food amount is:..."
    * update food amount by decreasing 11 lbs for every execution*/

   public void eat (){

      --food;
       System.out.println(name+" is eating food.New food is:"+food);
   }
   public static void play(String place){
       //non static variable cannot be used in the static method without object
      // System.out.println(name);
       Dog d = new Dog();
       d.name = "PlayKing";
       System.out.println("Dog is playing at "+place);
       System.out.println("Dog is playing and not eating so food amount is still:"+food);
   }
   public String toString(){
       return "This is one dog";
   }
}
