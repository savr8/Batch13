package blocks;

public class Test1 {
    public static void main(String[] args) {
     //   System.out.println("TEST");

        Practice practice1=new Practice();
        Practice practice2=new Practice();
        Practice practice3=new Practice();
        Practice practice4=new Practice();
        System.out.println(practice1.name);
        practice1.name="Robert";
        System.out.println(practice1.name);
        System.out.println(practice2.name);

        System.out.println(practice1.number);
        practice1.number = 200;
        System.out.println(practice1.number);
        System.out.println(practice2.number);



    }
}
