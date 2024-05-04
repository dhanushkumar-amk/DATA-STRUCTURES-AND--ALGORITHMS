package SORTING;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int [] arr={7,3,2,4,9,12,56};
        Arrays.sort(arr);
        int m=3;
        int left=0;
        int right=m-1;
        int max=Integer.MIN_VALUE;
        for (int x:arr) System.out.print(x+" ");
        System.out.println();
        while(left<=right)
        {
            if(arr[right]-arr[left]>max) {
                max = Math.max(max, arr[right] - arr[left]);
                System.out.println(left+" "+right);
            }
            left++;
            right--;
        }
        System.out.println(max);
    }
}
