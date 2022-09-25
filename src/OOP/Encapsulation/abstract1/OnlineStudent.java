package OOP.Encapsulation.abstract1;

public class OnlineStudent extends Student {
    public OnlineStudent() {
        super("Alex", 23);
    }

    @Override
    public void study() {
        System.out.println("Online students studying at home");
    }

    public Integer watch(String day) {
        System.out.println("Online students is watching via zoom");

        if (
                day.equalsIgnoreCase("weekday")
        ) return 3;

        else {
            return 4;
        }
    }

    @Override
    public void eating(){
        System.out.println("Online students is eating at home");
    }

}
