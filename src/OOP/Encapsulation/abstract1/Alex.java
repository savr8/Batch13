package OOP.Encapsulation.abstract1;

public class Alex extends SelfLearner {
    public Alex() {
        super("Self", 1);
    }

    public void goToLibrary() {

        System.out.println("Alex is going to public library");
    }

    public Integer watch(String day) {

        System.out.println("Alex is watching at library");
        return 1;
    }


}
