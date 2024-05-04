package SORTING;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int [] arr = {7, 3, 2, 4, 9, 12, 56};
        Arrays.sort(arr);
        int m=3;
        int left=0;
        int right=m-1;
        int max=Integer.MIN_VALUE;
        System.out.println(arr[m-1]);
        System.out.println(arr[0]);
        System.out.println(arr[m-1]-arr[0]-2);
    }
}
