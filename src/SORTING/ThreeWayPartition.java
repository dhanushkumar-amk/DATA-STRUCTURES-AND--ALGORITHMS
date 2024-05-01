package SORTING;

import java.util.Arrays;

public class ThreeWayPartition {
    static void partition(int[] arr,int a,int b) {
        int start=0;
        int n= arr.length;
        int end=n-1;
        int j=0;
        while(j<=end){
            if(arr[j]<a)
            {
                int temp=arr[j];
                arr[j]=arr[start];
                arr[start]=temp;
                j++;
                start++;
            }
            else if(arr[j]>b)
            {
                int temp=arr[j];
                arr[j]=arr[end];
                arr[end]=temp;
                end--;
            }
            else j++;
        }
    }
    public static void main(String[] args) {
        int [] arr ={10 ,7, 6 ,1 ,4, 10 ,5 ,2 ,7, 5, 3, 3, 8, 3 ,8};
        int a=5;
        int b=5;
        partition(arr,a,b);
        Arrays.sort(arr);
        int Min=Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0; i<n; i++)
        {
            if(i>0 && arr[i]-arr[i-1]<Min)
                Min=Math.min(arr[i]-arr[i-1]);
        }
//        return Min;
        for (int x:arr) System.out.print(x+" ");
    }
}
