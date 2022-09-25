package object;

public class Cup {
    boolean isClean;
    int size;
    String materialType;

    public boolean isClean() {

        System.out.println("This is isClean method");
        return isClean;
    }

    public Cup(boolean isClean, int size, String materialType) {
        System.out.println("Blahblah");
        this.isClean = isClean;//initialize
        this.size = size;
        this.materialType = materialType;
        this.isClean();
    }

    public Cup() {
        this(true, 5, "wood");
    }
}
