package Arrays;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;

        for(int i : nums){
            eleSum += i;

            int temp = i;

            while(temp > 0){
                int digit = temp % 10;
                digitSum += digit;

                temp/=10;
            }
        }

        return Math.abs(eleSum - digitSum);
    }


}
