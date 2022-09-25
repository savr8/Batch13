package String;

public class Methods2 {
    public static void main(String[] args) {
        String city ="windy city is chicago";
        //indexOf() returns index number of given char

       int num1 = city.indexOf('h');

        System.out.println(city.indexOf('c'));//if there are more than one matching char in the
        //given string,it will return first matching chars index

        int num2= city.indexOf('c',1);
        System.out.println("second matching 'c' index is: "+ num2);

        //make the 'from index parameter /number dynamic to find second matching 'c 'in the string 'chicago'

        int num3 = city.indexOf('c',city.indexOf('c')+1);
        System.out.println("second matching 'c' index with dynamic code is;"+num3);

       int num4 = city.indexOf('x');//it will return -1 it means there is no matching char(there no x)in the string

        System.out.println(num4 );

        System.out.println(city.indexOf('c',120));//-1
        //windy city is chicago
        System.out.println(city.indexOf("go"));//it will find matching char seqeunces from given string,
        //if it dies match/find,it will return first matching letter index

        System.out.println(city.indexOf('g')==city.indexOf("go"));//true

        System.out.println(city.indexOf("city"));
    }
}
