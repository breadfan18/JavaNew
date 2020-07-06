package newPractice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        map.put("Alaska", "Juneau");

//        String cap = map.get("Oregon");
//        System.out.println("The capital of Oregon is "  + cap);

        System.out.println("HashMap Iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("The capital of "  + key + " is " + map.get(key));
        }

        System.out.println(" ");

        System.out.println("Hashmap Foreach");
        for (String key: keys) {
            System.out.println("The capital of "  + key + " is " + map.get(key));
        }

    }
}
