package BinarySearch;
import java.util.*;
public class NumberOfPairs {

    public long countPairs(int x[], int y[], int M, int N) {
        Arrays.sort(x);
        Arrays.sort(y);
        int[]count=new int[5];
        for(int i=0;i<=N-1;i++){
            if(y[i]<5){
                count[y[i]]++;
            }
            if(y[i]>4){
                break;
            }

        }
        long res=0;
        for(int i=0;i<=M-1;i++){
            if(x[i]==0){
                res=res+0;
            }
            else if(x[i]==1){
                res=res+count[0];
            }
            else if(x[i]==2){

                res=res-count[3]-count[4]+count[0]+count[1];

                int countgt2=getIndex(y,2,N);
                if(countgt2!=-1){
                    res=res+N-countgt2;
                }
            }

            else{

                int countgt=getIndex(y,x[i],N);
                res=res+count[0]+count[1];
                if(countgt!=-1){
                    res=res+N-countgt;
                }
                if(x[i]==3){
                    res=res+count[2];
                }
            }
        }

        return res;

    }


    static int getIndex(int[] y,int ele,int n){

        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
        int ans=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(y[mid]>ele){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }
}

