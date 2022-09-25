package object;

public class GarbagePractice {
    public static void main(String[] args) {
        Flower flower=new Flower("Rose",11);
        Flower flower1=new Flower("Daisy",10);
        Flower flower2=new Flower("Lily",5);
        Flower flower4=new Flower("Lily",5);
        Flower flower3=flower1;

        System.out.println("-------------------------");

        System.out.println(flower==flower2);//false
        System.out.println(flower1==flower3);//true
        System.out.println(flower2==flower4);//false
        System.out.println(flower2.type.equals(flower4.type));//true


        System.out.println(flower2.equals(flower4));//false

        System.out.println("---------------------------");

        System.out.println(flower1.type);//Daisy
        System.out.println(flower2.type);//Lily
        System.out.println(flower3.type);//Daisy

        System.out.println(flower1);
        System.out.println(flower3);

        flower1=null;
        System.out.println(flower3);
        System.out.println("**************");
        System.out.println(flower1);

        flower3=flower1;
        System.out.println(flower3);

      //  System.out.println(flower3.type);  .NullPointerException ,you cannot reach out the field type with null reference

        System.gc();//this method call for gc();will make sure unuseful object to take to garbage

        System.out.println(flower3.type);

        //after test>>create method to stop connection to the database
    }
}
