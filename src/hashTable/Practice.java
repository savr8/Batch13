package hashTable;

import java.util.Hashtable;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Rose", 2);
        hashtable.put("Sunflower", 1);
        hashtable.put("Lily", 5);
        hashtable.put("Dasy", 8);
        System.out.println(hashtable.size());
        System.out.println(hashtable.get("Daisy"));
        System.out.println(hashtable.keySet());
        System.out.println(hashtable.entrySet());
        //no null key or value
        //  hashtable.put(null,5);NullPointerException
        // System.out.println(hashtable);
        //  hashtable.put("Tulip",null)NullPointerException
        //use entrySet method to get all pairs from hashTable and check if the key starts with letter 's'/'S'
        //send a message like following "Flower name could be Sunflower

        // hashtable.entrySet();
        hashtable.put("scilla", 10);
        for (Map.Entry<String, Integer> pair : hashtable.entrySet()) {
            if (pair.getKey().startsWith("s") || pair.getKey().startsWith("S")) {
                System.out.println("Flower name could be Sunflower>>" + pair.getKey());
            }
        }
    }
}
