package IfStatements;

public class ElsePractice {
    public static void main(String[] args) {
        String flower = "Violet";

        if (flower.startsWith("Vio")){
            System.out.println("This could be a Violet");
        }
        else{
            System.out.println("This could be Rose");
        }
        System.out.println("++++++++++++++++++++");
        if(flower.contains("let")){
            System.out.println("Flower is violet");
        }
        System.out.println("Flower could be Rose");

        System.out.println("_________________");
        if(flower.equals("Violet"))
            System.out.println("this is for Savr");

        else
            System.out.println("This is for yuo");
        System.out.println("Last print");
    }
}
