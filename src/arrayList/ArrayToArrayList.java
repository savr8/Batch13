package arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ArrayToArrayList {
    public static void main(String[] args) {

        String[]countries={"USA","Canada","Mexico"};

     List<String > countriesList = Arrays.asList(countries);

        System.out.println(countriesList);
     //   countriesList.add("newCountry");//UnsupportedOperationException

      //  countriesList.remove("Canada");//UnsupportedOperationException
        countriesList.set(0,"usa");
        System.out.println(countriesList);

        List items =Arrays.asList(1,2,3,4,5,6);
        System.out.println(items);
        List item2 = Arrays.asList("bee","butterfly","spider","fly","mosquito");
        System.out.println(item2);
       // item2.add("ant");//UnsupportedOperationException
        System.out.println(item2);

        ArrayList l2=new ArrayList<>();
        l2.addAll(item2);
        l2.add("xyz");
        System.out.println(l2);

    }
}
