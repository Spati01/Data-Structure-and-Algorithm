package Arrays;

import java.util.HashSet;

import java.util.*;

public class LongestConsecutiveSequence {

    class Solution1 {
        public int longestConsecutive(int[] nums) {

            int n = nums.length;
            Arrays.sort(nums);

            int count = 1;
            if(n==0)return 0;

            int longest = 0;

            for(int i=1; i<n; i++){
                if(nums[i] != nums[i-1]){
                    if(nums[i] == nums[i-1] + 1){
                        count++;
                    }else{
                        longest = Math.max(longest, count);
                        count = 1;
                    }
                }
            }


            return Math.max(longest, count);


        }
    }




    class Solution2 {
        public int longestConsecutive(int[] nums) {

            int n = nums.length;
            HashSet<Integer> set = new HashSet<>();
            int count = 1;
            int longest = 0;

            if(n == 0)return 0;

            for(int num : nums){
                set.add(num);
            }

            for(int num : set){
                if(!set.contains(num - 1)){
                    int ele = num;
                    count = 1;

                    while(set.contains(ele + 1)){
                        count++;
                        ele++;
                    }
                }

                longest = Math.max(longest, count);
            }

            return longest;

        }
    }


}
