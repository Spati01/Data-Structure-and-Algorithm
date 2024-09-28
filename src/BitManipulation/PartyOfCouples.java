package BitManipulation;

public class PartyOfCouples {
    class Solution{
        static int findSingle(int n, int arr[]){
            // code here
            int unique = 0;
            for(int num : arr){
                unique ^= num;
            }

            return unique;
        }
    }


}
