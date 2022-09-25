package stringBuilder;

public class Task1 {

    //create a function which is taking a StringBuilder Array as parameter
    //this function willreplace middle char element ,from the given array with *
    //make sure it is replasing only on the elements which has odd number of letter

    //{Ap*le,orange,kivi gr*pe}

   static void replaceMindChar(StringBuilder[] array) {
        for (StringBuilder builder : array) {
            if (builder.length() % 2 != 0) {
                System.out.println(builder.replace(builder.length() / 2, (builder.length() / 2) + 1, "*"));

            }
        }
    }

    public static void main(String[] args) {
        StringBuilder[] stringBuilders = {new StringBuilder("Apple"), new StringBuilder("Orange"), new StringBuilder("Grape")};
    replaceMindChar(stringBuilders);
    }
}

