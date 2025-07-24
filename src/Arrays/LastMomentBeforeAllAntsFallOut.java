package Arrays;

public class LastMomentBeforeAllAntsFallOut {

    public int getLastMoment(int n, int left[], int right[]) {
        // code here

        int result = 0;

        for(int l : left){
            result = Math.max(result, l);
        }

        for(int r : right){
            result = Math.max(result, n - r);
        }

        return result;
    }
}
