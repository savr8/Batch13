package immutableClass;

public class CupTest {
    public static void main(String[] args) {
        Cup cup = new Cup();
        System.out.println(cup.getColor());
        System.out.println(cup.getNumberOfHundle());
        System.out.println(cup.getSize());

        System.out.println(5 + cup.getSize()+25);
    }
}
