package OOP.Encapsulation.interface1;

public interface Shape {

 public    int SIDE = 4;

   public Number calculateArea();

   //you can not create regular method in the interface
 //  void getPerimeter(){
   //    System.out.println("Perimeter of shape is ...");
  // }

    abstract void getPerimeter();


}
