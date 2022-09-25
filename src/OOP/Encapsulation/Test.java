package OOP.Encapsulation;

public class Test {
    public static void main(String[] args) {
        City city = new City();

        System.out.println(city.getName());//null
        city.setName("Chicago");

     //   System.out.println(city.name);
        System.out.println(city.getName());//chicago
        System.out.println(city.getState());
        System.out.println(city.getPopulation());
        City city1 = new City();
        System.out.println(city1.getName());
        System.out.println(city.language);//null
        city.language="chinese";

        System.out.println(city1.language);
        System.out.println(city.language);

        city1.zipCode=111;
        System.out.println(city1.zipCode);
        System.out.println(city.zipCode);
        System.out.println(city.getName());//chicago
        System.out.println(city1.getName());//chicago

        city1.setZipCode(111);
        City.setZipCode(333);


    }
}
