package SORTING;

import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int   [][] arr = {{2, 6}, {8, 10}, {15, 18}};
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int ind=0;
        while(ind< arr.length)
        {
            int star=arr[ind][0];
            int end=arr[ind][1];
            while(){
                
            }
        }
    }
}
