package SORTING;

import java.util.Arrays;

public class SortAnArrayOfZerosOnesTwos {
    public static void main(String[] args) {
        int [] arr ={0,1,2,1,2,0};
        int start=0;
        int n= arr.length;;
        int a=0;
        int b=1;
        int c=2;
        int end=n-1;
        int j=0;
        while(j<=end) {
            if (arr[j] <=a) {
                int x = arr[start];
                arr[start] = arr[j];
                arr[j] = x;
                start++;
                j++;
            } else if (arr[j] >= c) {
                int x = arr[j];
                arr[j] = arr[end];
                arr[end] = x;
                end--;
            } else j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}