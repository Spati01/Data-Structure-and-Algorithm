package String;

import java.util.*;

public class LongestSubsequenceRepeatedKTimes {
    public String longestSubsequenceRepeatedKTimes(String s, int k) {


    HashMap<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()){
        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }
         freq.keySet().removeIf(key -> freq.get(key) < k);
    List<Character> remainingCharacters = new ArrayList<>(freq.keySet());
         remainingCharacters.sort((a,b) -> Character.compare(b,a));

    Queue<String> queue = new LinkedList<>();
         queue.add("");
    String answer = "";

         while(!queue.isEmpty()){
        String curr = queue.poll();
        for(char ch : remainingCharacters){
            String next = curr + ch;
            if(isKRepeatedSubsequence(s, next, k)){
                if(next.length() > answer.length() || next.length() == answer.length() && next.compareTo(answer) > 0){
                    answer = next;
                }
                queue.add(next);
            }
        }
    }

         return answer;
}
private boolean isKRepeatedSubsequence(String s, String sub, int k) {
    String target = sub.repeat(k);
    int j = 0;
    for (char ch : s.toCharArray()) {
        if (j < target.length() && ch == target.charAt(j)) {
            j++;
        }
    }
    return j == target.length();
}
}