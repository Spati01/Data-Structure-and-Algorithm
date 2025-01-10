package Arrays;

public class ReversePairs {

    class Solution {

        public int reversePairs(int[] nums) {
            int n = nums.length;
            if(nums == null  || nums.length < 2)return 0;
            return divide(nums, 0, n-1);

        }

        private int divide(int[] arr,int s, int e){
            int count = 0;
            if(s >= e)return 0;
            int mid = s + (e - s) / 2;
            count += divide(arr, s , mid);
            count += divide(arr, mid + 1, e);
            count += pairs(arr, s, mid, e);
            process(arr,s,mid,e);

            return count;
        }

        private int pairs(int[] arr, int s, int mid, int e){

            int count = 0;
            int j = mid + 1;

            for(int i=s; i<=mid; i++){
                while(j <= e && arr[i] > (long) 2 * arr[j]){
                    j++;
                }
                count += (j - (mid + 1));
            }

            return count;
        }

        private void process(int[] arr, int s, int mid, int e){
            int[] merge = new int[e - s + 1];
            int r = mid + 1;
            int l = s;
            int x = 0;

            while(l <= mid && r <= e){
                if(arr[l] <= arr[r]){
                    merge[x++] = arr[l++];
                }else{
                    merge[x++] = arr[r++];
                }
            }

            while(l <= mid){
                merge[x++] = arr[l++];

            }

            while(r <= e){
                merge[x++] = arr[r++];
            }

            for(int i=0; i<e-s+1; i++){
                arr[s+i] = (int) merge[i];
            }

        }
    }
}
