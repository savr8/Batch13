package String;

public class SplitPractice5 {
    public static void main(String[] args) {
 /*       String str = "Watermelon (Citrullus lanatus) is a flowering plant species of the Cucurbitaceae family and the name of its edible fruit. \n" +
                "A scrambling and trailing vine-like plant, it is a highly cultivated fruit worldwide, with more than 1,000 varieties.";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                str += str.charAt(i);
            }
        }
        System.out.println(str);*/
        String text = "Watermelon (Citrullus lanatus) is a flowering plant species of the Cucurbitaceae family and the name of its edible fruit.";
        String[] words = text.split(" ");

        for (String word : words) {
            if (word.length() % 2 == 0)
                System.out.println(word);
        }
    }
}
