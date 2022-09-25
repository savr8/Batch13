package object;

public class Clock {
    int countOfNumbers;
    String shape;
    boolean sound;

    String price;


    public Clock(String price) {
        this.price = price;
    }

    //override toString method in this class to see properties of any Clock object
    public String toString() {
        return countOfNumbers + "," + shape + "," + sound;
    }


    //create method which is defined by using var arg as parametr
    //this method will find out average miles that a person runs in a week(7)
    //5,7,10,2,0,0,5
    public static void averageMiles(int ... mile) {

        int sum = 0,average;

        for(int number :mile){//number from miles
            sum= sum +number;
        }
        average=sum/mile.length;//mile.lentgh -->taking numbers of parametrs
        System.out.println(average);
    }

    public static void main(String[] args) {
        Clock clock = new Clock("a");
        int number = 25;
        System.out.println(number);
        System.out.println(clock);
        Clock clock1 = new Clock("b");
        clock1.shape = "Rectangular";
        System.out.println(clock1);
        System.out.println("========================");
       averageMiles(4,5,6,7,8,9,0);
       averageMiles(1,2,3,4,5,6,7);

    }
}
