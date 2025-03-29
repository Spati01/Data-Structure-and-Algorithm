package Arrays;

public class MinimumAmountOfTimeToFillCups {

    class Solution {
        public int fillCups(int[] amount) {
            int n = amount.length;
            int seconds = 0;
            while(!isAllZero(amount)){
                decreaseMaxAndNext(amount);
                seconds++;
            }
            return seconds;
        }


        private static void decreaseMaxAndNext(int[] arr) {
            int maxIndex = -1, secondMaxIndex = -1;
            int maxVal = Integer.MIN_VALUE, secondMaxVal = Integer.MIN_VALUE;

            // Find the max and second max values and their indices
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxVal) {
                    secondMaxVal = maxVal;
                    secondMaxIndex = maxIndex;
                    maxVal = arr[i];
                    maxIndex = i;
                } else if (arr[i] > secondMaxVal) {
                    secondMaxVal = arr[i];
                    secondMaxIndex = i;
                }
            }

            // Decrease max value
            if (maxIndex != -1) {
                arr[maxIndex]--;
            }
            // Decrease second max value only if it's not already zero
            if (secondMaxIndex != -1 && arr[secondMaxIndex] > 0) {
                arr[secondMaxIndex]--;
            }
        }

        private static boolean isAllZero(int[] arr) {
            for (int num : arr) {
                if (num != 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
