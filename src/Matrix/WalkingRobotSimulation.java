package Matrix;

import java.util.HashSet;

public class WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dir = {0,1,0,-1,0};
        HashSet<Integer> set = new HashSet<>(obstacles.length);
        for(var e : obstacles){
            set.add(f(e[0],e[1]));
        }

        int ans = 0;
        int x = 0;
        int y = 0;
        int k = 0;

        for(int c : commands){
            if( c== -2){
                k = (k+3)%4;
            }else if(c == -1){
                k = (k + 1) % 4;

            }else{

                while(c-->0){
                    int nx = x + dir[k];
                    int ny = y + dir[k+1];
                    if(set.contains(f(nx,ny))){
                        break;
                    }

                    x = nx;
                    y = ny;
                    ans = Math.max(ans, x*x + y*y);
                }
            }
        }
        return ans;

    }
    private int f(int a, int b){
        return a*60010+b;
    }
}
