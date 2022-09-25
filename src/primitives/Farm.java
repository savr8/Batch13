package primitives;

public class Farm {
    public static void main(String[] args) {

         int cowleg =4;
         int chikleg =2;
         int cow=15;
         int chik=40;

        System.out.println("There are total of  "+ ((cowleg*cow)+(chik*chikleg)) +"    legs in this farm");

        double $cow= 1200,$chik=11.99;
        double worthOfFarm=cow*$cow+chik*$chik;


        System.out.println( "The worth of the farm    "+ worthOfFarm );


        double spending =1000;
        System.out.println(worthOfFarm - spending);

    }
}
