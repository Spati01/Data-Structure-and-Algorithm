package Math;

import java.util.ArrayList;

public class SieveOfEratosthenes {

    static ArrayList<Integer> sieveOfEratosthenes(int n){
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
    private  static boolean isPrime(int n){
        if(n <= 1)return false;

        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
