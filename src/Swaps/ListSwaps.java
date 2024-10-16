package Swaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListSwaps {

    // Using inbuilt methods
    private static List<Integer> ListSorted(List<Integer> list){

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                   Collections.swap(list,j, j+1);

                }
            }
        }
        return list;
    }

    // Using temp variable
    private static List<Integer> ListSortedTemp(List<Integer> list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                }
            }
        }
        return list;
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }



    System.out.println(ListSorted(list));



    }
}
