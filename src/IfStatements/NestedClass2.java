package IfStatements;

import java.util.Scanner;

public class NestedClass2 {

    public static void main(String[] args) {
        /*
        first ask candidate if s/he knows java
                  if s/he says 'yes' --> ask about selenium knowledge
                    if s/he says 'yes' --> ask about API testing
                      if s/he says 'yes' --> ask about SQL knowledge
                       "Congrats! You are hired"
                        if s/he says 'no' --> we need SQL knowledge
                      if s/he says 'no' --> "We need API knowledge"
                    if s/he says 'no' --> "We need selenium skills"
                  if s/he says 'no' --> "please learn java and try again"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Do you know Java yes/no");
        String java = scanner.next();
        if (java.equalsIgnoreCase("yes")) {
            // yes for java
            System.out.println("Do you know Selenium? yes/no");
            String selenium = scanner.next();
            if (selenium.equalsIgnoreCase("yes")) {
                //selenium is yes
                System.out.println("Do you know API testing? yes/no");
                String api = scanner.next();
                if (api.equalsIgnoreCase("yes")) {
                    // api is yes
                    System.out.println("DO you know SQL? yes/no");
                    String sql = scanner.next();
                    if (sql.equalsIgnoreCase("yes")) {
                        // sql is yes
                        System.out.println("Congrats! You are hired");
                    } else {
                        // sql is no
                        System.out.println("we need SQL knowledge");
                    }
                } else {
                    //api is no
                    System.out.println("We need API knowledge");
                }
            } else {
                //selenium is no
                System.out.println("We need selenium skills");
            }
        } else {
            // java is no
            System.out.println("please learn java and try again");
        }
    }
}