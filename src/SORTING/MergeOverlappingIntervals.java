package SORTING;

import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{2, 6}, {8, 10}, {2, 3}, {15, 18}};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j=i; j< arr.length; j++)
            {
                System.out.print(arr[j]+" ");
            }
        }
    }
}
