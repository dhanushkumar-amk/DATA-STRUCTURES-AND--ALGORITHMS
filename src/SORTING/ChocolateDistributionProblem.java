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
        System.out.println(arr[m-1]);
        System.out.println(arr[m[0]]);
        System.out.println(arr[m-1]-arr[0]);
    }
}
