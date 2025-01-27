package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private static LinkedHashMap<Integer,Integer> map;
    private final  int cap;
    // Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap) {
        // code here
        this.cap = cap;
        map = new LinkedHashMap<>(cap, 0.75f, true){
            protected  boolean removeEldestEntry(Map.Entry eldest){
                return size() > cap;
            }
        };
    }

    // Function to return value corresponding to the key.
    public static int get(int key) {
        // your code here
        return map.getOrDefault(key, -1);
    }

    // Function for storing key-value pair.
    public static void put(int key, int value) {
        // your code here
        map.put(key, value);
    }
}
