package object;
import java.util.Arrays;
public class FlowerTest {
    public static void main(String[] args) {


    Flower flower1 = new Flower("Violet", "Medium", "Violet", 11);

     Flower flower2 = new Flower("Rose", "Medium", "Red", 14);
    Flower flower3 = new Flower("Lily", "Small", "White", 5);
    Flower flower4 = new Flower("Orchard", "Large", "Yellow", 7);

    int[] numbers = new int[5];

    Flower[] vase1 = new Flower[4];

    vase1[0]=flower1;
    vase1[1]=flower2;
    vase1[2]=flower3;
    vase1[3]=flower4;
    Flower[]vase2={flower1,flower2,flower3,flower4};

        System.out.println(Arrays.toString(vase2));
        flower2.priceChecker(vase2);

}}
