package Arrays;

public class MissingInArray {


    // 1st Solution



    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int xorNum = 0;
        int xorEle = 0;

        for(int i=1; i<=n; i++){
            xorNum ^= i;
        }

        for(int num : arr){
            xorEle ^= num;
        }

        return xorNum ^ xorEle;
    }


    // 2nd Solution


    class Solution {

        // Note that the size of the array is n-1
        int missingNumber(int n, int arr[]) {

            int sum = (n*(n+1))/2;
            int ans = 0;
            for(int i: arr){
                ans += i;
            }
            return sum - ans;

        }
    }

}

