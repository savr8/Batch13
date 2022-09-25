package RecapJavaWithAhmed.OOPRECAP;

public class AbstractAndInterface {
    /*
        POSSIBLE INTERVIEW QUESTIONS:
    1-What is abstract?
   *Abstract is a way to organize the methods with no body.It means whoeverOVERRIDE this method they will
   do their OWN IMPLEMENTATION use key EXTENDS

    2-Why do you need to have abstract class in your project?
   *For many methods,we need developers to make their own implementation in the company,so they can create
   abstract class and methods with the specific names that are not duplicates and let people call it based
   on their requirement(LIKE OVERRIDE AND DO YOUR OWN IMPLEMENTATION)

    3-Where do you use abstract class in your project?

   I use almost everywhere in my project.(Example:We have a robot which scans all the products from store
   and it sends a lot of data to us.We manipulate these data based on our implementation.These implementaion
   are mostly created based on OOPconcept which covers Abstract class as well)
    4 -Can you create an object from abstract class?If no,how are you going
    to access all of the abstract methods from that class?

   No you cannot create an object from Abstract class.I can access all of the methods by OVERRIDING after I use
   extends keyword between abstract and regular class
   4.1->Cou can have regular method under abstract class?
   Yes you can

    5-What is the Interface?

    *NOTE:Interface is a blueprint of the object like class witch has special methods that can be overridden.
  *We use Implement keyword to make the class connected with interface

    ***6- What is the difference between Abstract and Interface?***
    INTERFACE:
    1-INTERFACE keyword
    2-INTERFACE can have ONLY ABSTRACT METHODS(public abstract as default)-->DEFAULT KEYWORD(EXEPTION-extra)
    3To make a connection with interface class,we need to use "IMPLEMENTS"keyword
    4**)In Interface you can use implements keyword as many as you want(THAT IS THE MAIN REASON WHY PEOPLE USE INTERFACE)
    -->CHILD CAN HAVE MULTIPLE PARENT.
    5-You cannot create a constructor in interface
    6-method access modifiers must public

    ABSTRACT:
    1-ABSTRACT keyword
    2-ABSTRACT can have both abstract and regular methods
    3-To make a connecton with abstract class,we need to use"EXTENDS"keyword
    4 In abstract you can use Extends keyword ONLY ONCE.-->You can have ONLY ONE PARENT
    5 You can create a constructor in Abstract
    6 Methods access modifiers can be anything(public protected)
     */
}
