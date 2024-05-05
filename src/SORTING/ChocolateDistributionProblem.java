package SORTING;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int [] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        Arrays.sort(arr);
        int m=5;
        int left=0;
        int right=m-1;
        int min=Integer.MAX_VALUE;
        while(right< arr.length)
        {
            if(arr[right]-arr[left]<min)
                min=Math.min(arr[right]-arr[left],min);
            left++;
            right++;
        }
        System.out.println(min);
    }
}
