package BinarySearch;

public class SumOfMutatedArrayClosestToTarget {


    class Solution {
        public int findBestValue(int[] arr, int target) {
            int sum = 0;
            int max =Integer.MIN_VALUE;
            for(int i : arr){
                sum+=i;
                max = Math.max(max,i);
            }
            if(sum == target) return max;
            int min = 0;
            int res = 1;
            int diff = Integer.MAX_VALUE;
            while(min <= max){
                int mid = min + (max - min)/2;
                sum = getSum(arr,mid);
                if(sum > target){
                    max = mid - 1;
                }else{
                    min = mid + 1;
                }
                if(Math.abs(sum - target) < diff || (Math.abs(sum - target) == diff) && mid < res){
                    res = mid;
                    diff = Math.abs(sum - target);
                }


            }


            return res;
        }
        private int getSum(int[] arr, int mid){
            int sum = 0;
            for(int i : arr){
                sum+= (i > mid ? mid : i);
            }
            return sum;
        }
    }



}
