package ARRAYS;

import java.util.Scanner;

public class PrefixSum {
    static  void prefixSumAdding(int[]arr) {
        for (int i=1; i< arr.length;++i)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        sum(0,1,arr);
    }
    static void  sum(int i,int j,int [] arr) {
        if(i==0)
            System.out.println(0+arr[j]);
        else System.out.println(arr[j]-arr[i-1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int arr[]  = new int[10];
     for (int i=0; i<10; i++)
         arr[i]=scanner.nextInt();

     for (int x:arr)

         System.out.print(x+" ");

     prefixSumAdding(arr);
    }
}