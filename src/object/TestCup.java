package object;

public class TestCup {
    public static void main(String[] args) {
        Cup cup = new Cup(true,4,"Paper");
        System.out.println(cup.materialType);//paper
        cup.materialType="plastic";
        System.out.println(cup.materialType);
        Cup cup1 = new Cup(true,16,"ceramic");
        System.out.println(cup.materialType);
        System.out.println(cup.isClean);
        System.out.println(cup1.isClean);
        System.out.println("++++++++++++++++++++");
        Cup cup2 = new Cup();
        System.out.println("============================");
        System.out.println(cup2.isClean);//default false


    }
}
