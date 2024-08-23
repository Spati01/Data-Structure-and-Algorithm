package Greedy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Pair{

    int start,end,pos;

    Pair(int start,int end,int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;

    }
}
class meetingComparator implements Comparator<Pair> {


    public int compare(Pair p1,Pair p2){
        if(p1.end < p2.end) return -1;
        else if(p1.end > p2.end) return 1;
        else if(p1.pos < p2.pos) return -1;
        else return -1;
    }
}



public class NMeetingsInOneRoom {

    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0; i<n; i++)
            list.add(new Pair(start[i],end[i],i+1));

        meetingComparator meet = new meetingComparator();
        Collections.sort(list,meet);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(list.get(0).pos);
        int limit = list.get(0).end;

        for(int i=1; i<n; i++){
            if(limit < list.get(i).start){
                ans.add(list.get(i).pos);
                limit = list.get(i).end;
            }
        }

        return ans.size();
    }
}
