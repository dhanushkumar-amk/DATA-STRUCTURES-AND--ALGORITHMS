package SORTING;

import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{2, 6}, {8, 10}, {15, 18}};
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        for (int[] x:arr)
            for (int xx:x)
                System.out.print(xx+" ");
    }
}
