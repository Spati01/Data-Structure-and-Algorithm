package Arrays;

import java.util.ArrayList;

public class IndexesOfSubarraySum {
    class Solution {
        public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
            // code here
            ArrayList<Integer>li=new ArrayList<>();
            int i=0;
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=arr[j];

                while(sum>s)
                {
                    sum-=arr[i];
                    i++;
                }
                if(s==sum&&i<=j)
                {
                    li.add(i+1);
                    li.add(j+1);
                    return li;
                }
            }
            li.add(-1);
            return li;


        }
    }

}
