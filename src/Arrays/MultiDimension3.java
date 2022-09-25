package Arrays;

import java.util.Arrays;

public class MultiDimension3 {
    public static void main(String[] args) {

            String[][] citiesOfStates = new String[5][2];
            System.out.println(Arrays.deepToString(citiesOfStates));
            // System.out.println( citiesOfStates[5][0]); // ArrayIndexOutOfBoundsException
            //  System.out.println(citiesOfStates[0][2]); // ArrayIndexOutOfBoundsException
            String[][] citiesOfStates1 = {{"Springfield", "Chicago"}, {"Tampa"}, {"Houston", "Dallas", "Austin"}, {"Brooklyn"}};
            System.out.println(Arrays.deepToString(citiesOfStates1));
            System.out.println(citiesOfStates1[3][0]);
            Arrays.sort(citiesOfStates1[0]);
            System.out.println(Arrays.toString(citiesOfStates1[0]));
            // print out every city one by one(by using index)
            for (int i = 0; i < citiesOfStates1.length; i++) {
                for (int k = 0; k < citiesOfStates1[i].length; k++) {
                    System.out.println(citiesOfStates1[i][k]);
                    // System.out.println(citiesOfStates1[i][k].length()); // length of each string(number of the letters on each city)
                    //  System.out.println(citiesOfStates1[i].length); //count of cities in each state(number of elements in inner array)
//                if ( citiesOfStates1[i][k].equalsIgnoreCase("Tampa") || citiesOfStates1[i][k].equalsIgnoreCase("houston")){
//                    System.out.println("it must be really hot over there during the summer because you live in >> "+citiesOfStates1[i][k]);
//
//                }else {
//                    System.out.println("weather should be fine since you are in >> "+citiesOfStates1[i][k]);
//                }

                }
                System.out.println(citiesOfStates1[i].length);// count of cities in each state(number of elements in inner array)
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            // when you see Tampa or Houston say "it must be really hot over there during the summer"
            System.out.println("+++++++++++++++++++++++++++");
            for (String[] cities : citiesOfStates1) {
                System.out.println(cities.length);
                for (String city : cities) {
                    System.out.println(city);
                }
            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            System.out.println("++++++++++++++++++++++++++++++++++++");
            // when you see Tampa or Houston say "it must be really hot over there during the summer"
            for (String[] states : citiesOfStates1) {
                for (String city : states) {
                    if (city.equalsIgnoreCase("Tampa") || city.equalsIgnoreCase("houston")) {
                        System.out.println("it must be really hot over there during the summer because you live in >> " + city);
                    } else {
                        System.out.println("weather should be fine since you are in >> " + city);
                    }
                }
            }


        }
    }
