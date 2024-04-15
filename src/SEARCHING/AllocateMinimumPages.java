package SEARCHING;

import java.util.Arrays;

public class AllocateMinimumPages {
//    static int recursive(int [] arr,int n,int student){
//return 1;
//    }
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        Arrays.fill(arr, 32); // Fill the array with a constant value for simplicity

        // Measure the time taken by the first solution
        long startTime1 = System.nanoTime();
        int sum1 = 0;
        int left1 = 0;
        int leftMid1 = (arr.length / 2) - 1;
        int rightMid1 = (arr.length / 2);
        int right1 = arr.length - 1;
        if (arr.length >= 4) {
            while (left1 < leftMid1 && right1 > rightMid1) {
                sum1 += arr[left1++] + arr[leftMid1--] + arr[right1--] + arr[rightMid1++];
            }
        } else {
            while (left1 < right1) {
                sum1 += arr[left1++] + arr[right1--];
            }
        }
        long endTime1 = System.nanoTime();
        double elapsedTime1 = (endTime1 - startTime1) / 1_000_000.0; // Convert nanoseconds to milliseconds
        System.out.println("Time taken by first solution: " + elapsedTime1 + " milliseconds");

        // Measure the time taken by the second solution
        long startTime2 = System.nanoTime();
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        long endTime2 = System.nanoTime();
        double elapsedTime2 = (endTime2 - startTime2) / 1_000_000.0; // Convert nanoseconds to milliseconds
        System.out.println("Time taken by second solution: " + elapsedTime2 + " milliseconds");}
}
