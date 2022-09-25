package object;

public class Cat {
    String name ;
    int age ;
    String breed ;
    int food  ;
String colour;
    public void sound (){
        System.out.println(name+" meawing");

    }
    public void info(){
        System.out.println("name is:"+name+" age is "+age+" bread is "+breed+" food "+food);

    }
    public void eat(){
     food=food-1;
        System.out.println("After cat eats ,food is "+food);
    }
    public void walk(String destination){
        System.out.println(name+" is walking to "+destination);
    }
//create a method to initialaze the colour of cat
public void setColour(String colour1){
         colour = colour1;
}
//create a method to get/return the color of cat
public String getColour(){
    return colour;
}
    public void setName(String name1){
        name =name1;
    }
    public String getName(){
        return name;
    }

}
