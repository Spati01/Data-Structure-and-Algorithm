package String;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.*;

public class ConstructStringWithRepeatLimit {

    class Solution {

        static class Pair {
            char charVal; // Character
            int count;    // Frequency of the character

            Pair(char c, int count) {
                this.charVal = c;
                this.count = count;
            }
        }
        public String repeatLimitedString(String s, int repeatLimit) {
            String str = lexicographicallyLargestSort(s);

            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0; i<str.length(); i++){
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }

            StringBuilder result = new StringBuilder();
            PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.charVal - a.charVal);

            // Add all characters to the max-heap
            for (char c : map.keySet()) {
                maxHeap.offer(new Pair(c, map.get(c)));
            }

            while (!maxHeap.isEmpty()) {
                Pair current = maxHeap.poll();
                int countToAdd = Math.min(current.count, repeatLimit);

                // Append the current character
                for (int i = 0; i < countToAdd; i++) {
                    result.append(current.charVal);
                }

                current.count -= countToAdd;

                // If we still have remaining count for the current character
                if (current.count > 0) {
                    // Check if we can add another character
                    if (maxHeap.isEmpty()) {
                        break; // No more characters to add
                    }

                    // Get the next largest character
                    Pair next = maxHeap.poll();
                    result.append(next.charVal); // Add the next character
                    next.count--; // Decrement its count

                    // Put the next character back into the heap if it still has counts left
                    if (next.count > 0) {
                        maxHeap.offer(next);
                    }

                    // Put the current character back into the heap
                    maxHeap.offer(current);
                }
            }

            return result.toString();
        }

        public static String lexicographicallyLargestSort(String s) {
            // Convert the string to a character array
            char[] charArray = s.toCharArray();

            // Sort the array in reverse order
            Arrays.sort(charArray);
            StringBuilder sortedString = new StringBuilder(new String(charArray));
            sortedString.reverse();

            return sortedString.toString();
        }
    }
}
