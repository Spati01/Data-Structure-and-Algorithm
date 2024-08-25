package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CountAlmostEqualPairsI {
    public int countPairs(int[] nums) {

        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(isEqual(nums[i], nums[j])){
                    count++;
                }
            }

        }
        return count;
    }
    private boolean isEqual(int nums1, int nums2){
        String str1 = Integer.toString(nums1);
        String str2 = Integer.toString(nums2);

        while(str1.length() < str2.length()){
            str1 = "0" + str1;
        }

        while(str2.length() < str1.length()){
            str2 = "0" + str2;
        }

        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                count++;
                list.add(i);

                if(count > 2) return false;
            }
        }

        if(count == 0) return true;

        if(count == 2){
            char[] ch = str1.toCharArray();
            int idx1 = list.get(0);
            int idx2 = list.get(1);

            char temp = ch[idx1];
            ch[idx1] = ch[idx2];
            ch[idx2] = temp;

            return String.valueOf(ch).equals(str2);
        }

        return false;
    }
}
