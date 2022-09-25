package arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Canada");
        countries.add("Peru");
        System.out.println(countries);
        Object[] countriesArray = countries.toArray();
        System.out.println(Arrays.toString(countriesArray));
        countriesArray[0]="usa";
        System.out.println(Arrays.toString(countriesArray));

        countriesArray[4]="newCountry";//.ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(countriesArray));
    }
}
