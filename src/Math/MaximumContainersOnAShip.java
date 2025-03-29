package Math;

public class MaximumContainersOnAShip {

    class Solution {
        public int maxContainers(int n, int w, int maxWeight) {
            int loaded = 0;
            int loadedWeight = 0;
            for(int i=0; i<n*n; i++){
                loadedWeight += w;
                if(loadedWeight <= maxWeight){
                    loaded++;

                }
            }

            return loaded;
        }
    }
}
