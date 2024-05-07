package SORTING;

import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{2, 6}, {8, 10}, {2, 3}, {15, 18}};
        int [] temp =new int[arr.length*2];
        int ind=0;
        for (int [] temp1:arr)
            for (int temp2:temp1)
                temp[ind++]=temp2;
        Arrays.sort(temp);
        for (int i=0;i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                
            }
        }
    }
}
