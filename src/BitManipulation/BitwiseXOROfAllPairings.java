package BitManipulation;

import java.util.HashMap;

public class BitwiseXOROfAllPairings {

    class Solution {
        public int xorAllNums(int[] nums1, int[] nums2) {

            int n = nums1.length;
            int m = nums2.length;
            int xor1 = 0;
            int xor2 = 0;

            if(m % 2 != 0){
                for(int num : nums1){
                    xor1 ^= num;
                }
            }

            if(n % 2 != 0){
                for(int num : nums2){
                    xor2 ^= num;
                }
            }


            return xor1 ^ xor2;

        }
    }


    class Solution1 {
        public int xorAllNums(int[] nums1, int[] nums2) {

            int n = nums1.length;
            int m = nums2.length;


            HashMap<Integer, Integer> map = new HashMap<>();

            for(int num : nums1){
                map.put(num, map.getOrDefault(num, 0) + m);
            }

            for(int num : nums2){
                map.put(num, map.getOrDefault(num, 0) + n);
            }
            int xor = 0;
            for(int key : map.keySet()){
                if(map.get(key) % 2 == 1){
                    xor ^= key;
                }
            }

            return xor;

        }
    }
}
