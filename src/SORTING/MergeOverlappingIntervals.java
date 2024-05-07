package SORTING;

import java.util.ArrayList;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{2, 6}, {8, 10}, {2, 3}, {15, 18}};
        ArrayList<Integer> arrayLists =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j<arr[i].length; j++)
            {
                arrayLists.add(arr[i][j]);
            }
        }
    }
}
