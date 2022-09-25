package object;

public class Netflix {
    String user;

    String accountName;
    static double monthlyData =200;
    public void streaming(double useAge){
        monthlyData=monthlyData-useAge;
        System.out.println("After "+user+" streamed left over data is :"+monthlyData);

    }

    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        netflix.user="kids";
        netflix.streaming(5);
        Netflix netflix2 = new Netflix();
    netflix2.user="Dmitri";
    netflix2.streaming(10);
    }


}
