package Arrays;

import java.util.*;

public class SortingElementsOfAnArrayByFrequency {

    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> {
            if (a.getValue() == b.getValue()) {
                return a.getKey() - b.getKey();
            } else {
                return b.getValue() - a.getValue();
            }
        });

        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}
/*  Let's use the provided input array {5, 5, 4, 6, 4} and walk through how the sorting process works step-by-step with the given code snippet.

Input Array
int[] arr = {5, 5, 4, 6, 4};
1. Counting Frequencies
First, you need to count the frequencies of each element in the array.

Map<Integer, Integer> map = new HashMap<>();
for (int i = 0; i < arr.length; i++) {
    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
}
map.getOrDefault(arr[i], 0) + 1 increments the count for each element.
After processing all elements, map will look like this:

{
    5: 2,
    4: 2,
    6: 1
}
2. Convert to List of Map Entries
Convert the map to a list of Map.Entry objects:

List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
This will give you a list with the following entries:


[(5, 2), (4, 2), (6, 1)]
3. Sort the List
Sort the list using the custom comparator:


Collections.sort(list, (a, b) -> {
    if (a.getValue().equals(b.getValue())) {
        return a.getKey() - b.getKey();
    } else {
        return b.getValue() - a.getValue();
    }
});
Comparator Breakdown:

Primary Sorting Criterion: Frequency (in descending order)
Secondary Sorting Criterion: Value (in ascending order) when frequencies are equal
Let’s apply the comparator step-by-step:

Initial List:


[(5, 2), (4, 2), (6, 1)]
Compare (5, 2) and (4, 2):

Frequencies are equal (2 == 2), so compare by values.
5 - 4 = 1, which is positive, so (4, 2) should come before (5, 2).
After this comparison, the list becomes:


[(4, 2), (5, 2), (6, 1)]
Compare (5, 2) and (6, 1):

Frequencies are not equal (2 > 1), so (5, 2) should come before (6, 1).
No change is needed here as (5, 2) is already before (6, 1).

Final Sorted List:

[(4, 2), (5, 2), (6, 1)]
4. Output the Sorted Elements
You can now use this sorted list to output elements according to the sorted order:


for (Map.Entry<Integer, Integer> entry : list) {
    for (int i = 0; i < entry.getValue(); i++) {
        System.out.print(entry.getKey() + " ");
    }
}
For the sorted list [(4, 2), (5, 2), (6, 1)], the output will be:

Copy code
4 4 5 5 6
Summary
Count frequencies: {5: 2, 4: 2, 6: 1}
Convert to list: [(5, 2), (4, 2), (6, 1)]
Sort:
By frequency descending: [(4, 2), (5, 2), (6, 1)]
For equal frequencies, sort by value ascending.
Output: 4 4 5 5 6

*/



