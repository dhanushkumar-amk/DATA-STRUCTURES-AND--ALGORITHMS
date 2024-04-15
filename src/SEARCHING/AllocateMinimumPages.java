package SEARCHING;

import java.util.Arrays;

public class AllocateMinimumPages {
//    static int recursive(int [] arr,int n,int student){
//return 1;
//    }
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        Arrays.fill(arr, 32); // Fill the array with a constant value for simplicity

        // Measure the time taken by the first solution

        // Measure the time taken by the second solution
        long startTime2 = System.nanoTime();
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        long endTime2 = System.nanoTime();
        double elapsedTime2 = (endTime2 - startTime2) / 1_000_000.0; // Convert nanoseconds to milliseconds
        System.out.println("Time taken by first solution: " + elapsedTime2 + " milliseconds");
        long startTime1 = System.nanoTime();
        long sum=0;
        int left=0;
        int right= arr.length-1;
        int leftMid= (arr.length/2)-1;
        int rightMid=(arr.length/2);
//        while(left<leftMid && right>rightMid)
//        {
//            sum+=arr[left++]+arr[leftMid--]+arr[right--]+arr[rightMid++];
//        }
        while(left<=right)
            sum+=arr[leftMid++]+arr[right--];
        long endTime1 = System.nanoTime();
        double elapsedTime1 = (endTime1 - startTime1) / 1_000_000.0; // Convert nanoseconds to milliseconds
        System.out.println("Time taken by second solution: " + elapsedTime1 + " milliseconds");

    }
}
