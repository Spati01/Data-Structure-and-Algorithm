package Arrays;

public class FindTheStudentThatWillReplaceTheChalk {

    public int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        for(int i : chalk){
            totalChalk += i;
        }
        k = (int)(k % totalChalk);

        for(int i=0; i<chalk.length; i++){
            if(k < chalk[i]){
                return i;
            }
            k -= chalk[i];
        }
        return -1;
    }
}
