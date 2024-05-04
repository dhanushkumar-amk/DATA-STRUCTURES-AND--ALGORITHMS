package SORTING;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int [] arr={7,3,2,4,9,12,56};
        Arrays.sort(arr);
        int m=3;
        int left=0;
        int right=3;
        int max=Integer.MIN_VALUE;
        while(left<right)
        {
            if(arr[right]-arr[left]>max)
                max=Math.min(max,arr[right]-arr[left]);
            left++;
            right--;
        }
        System.out.println(max);
    }
}
