package String;

import com.sun.xml.internal.ws.server.ServerRtException;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SplitPractice3 {
    public static void main(String[] args) {
        String paragraph = "Today is saturday. This is a very nice day to study." +
                "I am learning split method.! It returns String array. Want to solve this question by myself. That could be a party" +
                "It is cool to see:! How things are getting more easy";
        // print each sentence ot once
        String[] sentences = paragraph.split("\\.", 4);
        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }
        System.out.println("==============");
        String[] sentences1 = paragraph.split("!", 2);
        for (String sentence : sentences1) {
            System.out.println(sentence.trim());
        }
        // 06.18.2022 --> Print out true if the day is 18 of june
        // 06.19.2022
        // 06.20.2022
        // 06.17.2022
        // 06.16.2022
        String date = "06.18.2022"; //[06, 18, 2022]
        String[] partsOfDate = date.split("\\.");//[06, 18, 2022]
        if (partsOfDate[0].equalsIgnoreCase("06") && partsOfDate[1].equalsIgnoreCase("18")) {
            System.out.println("Happy birth day!!");

        }

    }
}
