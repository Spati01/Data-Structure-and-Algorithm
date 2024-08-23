package Arrays;

public class KthElementOfTwoArrays {

    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {

        int[] merge = new int[n+m];

        int i = 0;
        int j = 0;
        int x = 0;

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                merge[x++] = arr1[i++];
            }else{
                merge[x++] = arr2[j++];
            }
        }
        while(i< n){
            merge[x++] = arr1[i++];
        }
        while(j < m){
            merge[x++] = arr2[j++];
        }

        if(k >= 1 && k <= n+m){
            return merge[k-1];
        }else{
            return -1;
        }

    }

}
