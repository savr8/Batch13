package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prctice3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream stream = new FileInputStream("Testrrr");
            Scanner scanner = new Scanner(stream);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());

            }
        } catch (FileNotFoundException e) {
            System.out.println(" This is a type of IOException");
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());

        }


    }

}

