package OOP.Encapsulation.interface1;

public class Triangle implements Shape,Material {

    int side1=3;
    int base=4;
    int side2=5;
    int height=4;


  public   Double calculateArea(){
      System.out.println("Calculate area of Triangle");
        return(double) (height*base/2);
    }
    public void getPerimeter(){
      int peri=side1+side2+base;
        System.out.println("getting perimeter of the triangle "+peri);
    }
    public void melt(){
        System.out.println("Melting triangle");
    }

}
