package Arrays;

public class PrimeSubtractionOperation {

    class Solution {
        public boolean primeSubOperation(int[] nums) {
            boolean checkPrime[] = new boolean[1005];
            for(int  i = 2 ; i < 1005; i++){
                int j = i;
                int idx = 2;
                if(checkPrime[i] == false){
                    while(j < 1005){
                        checkPrime[j] = true;
                        j = i * idx;
                        idx++;
                    }
                }else checkPrime[i] = false;
            }

            for(int i = nums.length - 2; i >= 0; i--){
                if(nums[i] >= nums[i + 1]){
                    int BestPrimeDigit = Integer.MAX_VALUE;
                    int bestPrime = 2;
                    int prime = -1;
                    while(bestPrime < nums[i]){
                        if(checkPrime[bestPrime] == true){
                            int diff = nums[i] - bestPrime;
                            if((diff < BestPrimeDigit) && diff < nums[i + 1]){
                                BestPrimeDigit = diff;
                                prime = bestPrime;
                                break;
                            }
                        }
                        bestPrime++;
                    }
                    if(prime != -1)nums[i] -= prime;
                }
            }

            for(int j = 0; j < nums.length - 1; j++){
                if(nums[j] >= nums[j + 1])return false;
                // System.out.print(nums[j] + " ");
            }
            return true;
        }
    }
}
