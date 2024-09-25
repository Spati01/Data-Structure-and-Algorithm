package Trie;

import java.util.HashMap;

public class SumOfPrefixScoresOfStrings {




    class TrieNode {
        HashMap<Character, TrieNode> children;
        int count; // Count of prefixes that pass through this node

        public TrieNode() {
            children = new HashMap<>();
            count = 0;
        }
    }

    class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                node.children.putIfAbsent(ch, new TrieNode());
                node = node.children.get(ch);
                node.count++; // Increment the prefix count
            }
        }

        public int getPrefixScore(String word) {
            TrieNode node = root;
            int score = 0;
            for (char ch : word.toCharArray()) {
                if (node.children.containsKey(ch)) {
                    node = node.children.get(ch);
                    score += node.count; // Accumulate the count of prefixes
                } else {
                    break; // No further prefixes, exit early
                }
            }
            return score;
        }
    }

    class Solution {
        public int[] sumPrefixScores(String[] words) {
            Trie trie = new Trie();

            // Insert all words into the Trie
            for (String word : words) {
                trie.insert(word);
            }

            // Calculate prefix scores
            int[] scores = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                scores[i] = trie.getPrefixScore(words[i]);
            }

            return scores;
        }
    }

}
