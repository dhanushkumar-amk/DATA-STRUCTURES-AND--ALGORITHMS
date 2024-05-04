package SORTING;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int [] arr={3,4,1,9,56,7,9,12};
        Arrays.sort(arr);
        int m=5;
        int left=0;
        int right=m-1;
        int max=Integer.MIN_VALUE;
        for (int x:arr) System.out.print(x+" ");
        System.out.println();
        while(left<right)
        {
            if(arr[right]-arr[left]>max) {
                max = Math.max(max, arr[right] - arr[left]);
            }
            left++;
            right--;
        }
        System.out.println(max);
    }
}
