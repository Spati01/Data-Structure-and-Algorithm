package Arrays;

import java.util.*;




public class LongestSquareStreakInAnArray {


    class Solution {
        public int longestSquareStreak(int[] nums) {
            Arrays.sort(nums);
            int ans = -1;

            // HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {
                long x = (long) nums[i];
                long val = x * x;

                if (val <= Integer.MAX_VALUE && binarySearch(nums, (int) val)) {
                    int len = 1;


                    while (val <= Integer.MAX_VALUE && binarySearch(nums, (int) val)) {
                        len++;
                        val *= val;
                    }
                    ans = Math.max(ans, len);
                }
            }
            return ans < 2 ? -1 : ans;


        }

        private boolean binarySearch(int[] arr, int key) {
            int l = 0;
            int h = arr.length - 1;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (arr[mid] == key) {
                    return true;
                }
                if (arr[mid] > key) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }

            }
            return false;
        }

    }



    // Using Hash Set solution for performance optimization purposes only
    public class Hashset {


        public int longestSquareStreak(int[] nums) {
            Arrays.sort(nums);
            int ans = -1;

            HashSet<Integer> set = new HashSet<>();
            for (int i : nums) {
                set.add(i);
            }

            for (int i = 0; i < nums.length; i++) {
                long x = (long) nums[i];
                long val = x * x;

                if (val <= Integer.MAX_VALUE && set.contains((int) val)) {
                    int len = 1;


                    while (val <= Integer.MAX_VALUE && set.contains((int) val)) {
                        len++;
                        val *= val;
                    }
                    ans = Math.max(ans, len);
                }
            }
            return ans < 2 ? -1 : ans;


        }
    }
}
