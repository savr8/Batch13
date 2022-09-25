package blocks;

public class Practice {
    String name;
    static   int number;
    //create instance block
    {
        name = "Bob";
        System.out.println("Instance block");
        run();
        System.out.println(number);
    }

    //create static block,it runs only once and before everything in the class
    static {
       number =100;
        System.out.println("Static block");
        awake();
    }

    public void run(){
        System.out.println("Running");

    }
    public static void awake(){
        System.out.println("Not sleeping");
    }


}
