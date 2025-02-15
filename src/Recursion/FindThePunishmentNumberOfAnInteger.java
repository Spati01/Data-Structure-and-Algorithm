package Recursion;

public interface FindThePunishmentNumberOfAnInteger {

    class Solution {
        public int punishmentNumber(int n) {

            int res = 0;
            for(int i=1; i<=n; i++){
                String i2 = Integer.toString(i * i);
                if(isPartitions(0, i2, i, 0)){
                    res += (i * i);
                }
            }
            return res;
        }
        private boolean isPartitions(int j, String i2, int i, int cur_sum){

            int n = i2.length();

            if(j == n) return (cur_sum == i);

            for(int idx = j; idx < n; idx++){
                int val = Integer.parseInt(i2.substring(j, idx+1));
                if(isPartitions(idx + 1, i2, i, cur_sum + val)){
                    return true;
                }
            }

            return false;
        }

    }
}
