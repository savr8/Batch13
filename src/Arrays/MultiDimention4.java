package Arrays;

public class MultiDimention4 {
    public static void main(String[] args) {
        /*
        computers
        DELL,Acer,HP,McPro MacAir
        TVs
        Samsung,LG,Sony,Hisense
        Speakers
        Alexa,Google,JBL,Sonnos,Beats
        =======================
        Prices:
        computers:
        1400,1100,899.99,2400,1200
        TV:
        1500,800,7765.99,385.99
        Speakers:
        99.99,69.00,150,200,15.99
        //"The price for ..Mac Air ..is ..1200"
         */
        String[][] devices = {{"Dell", "Acer", "HP", "MacPro", "MacAir"}, {"Samsung", "LG", "Sony", "Hisense"}, {"Alexa", "Google", "JBL", "Sonnos", "Beats"}};
        double[][] prices = {{1400, 1100, 899.99, 2400, 1200}, {1500, 800, 7765.99, 385.99}, {99.99, 69.00, 150, 200, 15.99}};
        for (int a = 0; a < devices.length; a++) {
            for (int b = 0; b < devices[a].length; b++) {
                System.out.println("The price for " + devices[a][b] + " is $ " + prices[a][b]);
            }

        }
        //i want to see devices which are less than $1500
        for(int a=0;a<devices.length;a++){
           for(int b =0;b <devices[a].length;b++)
            if(prices[a][b]<1500)
                System.out.println("There are devices for less than 1500 "+devices[a][b]);
        }
        System.out.println("++++++++++++++++++++");
        //I want to see only apple and their prices

        for (int a =0;a<devices.length;a++){
            for (int b =0;b<devices[a].length;b++){
                if (devices[a][b].contains("Mac")){
                    System.out.println("These are apple product and prices "+devices[a][b]+">:>"+prices[a][b]);
                }
            }
        }

    }
}
