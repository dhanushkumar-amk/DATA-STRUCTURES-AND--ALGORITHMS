package  SORTING;

import java.util.Arrays;

class Solution{
    //Function to find minimum difference between any pair of elements in an array.
    public static int MinimumDifference(int arr[], int n) {
        Arrays.sort(arr);
        int Min=Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(i>0 && arr[i]-arr[i-1]<Min)
                Min=Math.min(arr[i]-arr[i-1],min);
        }
        return Min;
    }
}