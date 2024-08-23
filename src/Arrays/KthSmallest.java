package Arrays;

public class KthSmallest {


        public static int kthSmallest(int[] arr, int k) {
            // Your code here
            margeSort(arr,0,arr.length-1);

            return arr[k-1];
        }
        private static void margeSort(int[] arr, int s, int e){
            if(s < e){
                int m = s + (e - s)/2;
                margeSort(arr,s,m);
                margeSort(arr,m+1,e);

                marge(arr,s,m,e);
            }
        }
        private static void marge(int[] arr,int s,int m,int e){
            int[] marge = new int[e-s+1];
            int x = 0;
            int i = s;
            int j = m + 1;

            while(i <= m && j <= e){
                if(arr[i] <= arr[j]){
                    marge[x++] = arr[i++];
                }else{
                    marge[x++] = arr[j++];
                }
            }


            while(i <= m){
                marge[x++] = arr[i++];
            }

            while(j <= e){
                marge[x++] = arr[j++];
            }

            for(int k=0; k<marge.length; k++){
                arr[s+k] = marge[k];
            }
        }
    }



