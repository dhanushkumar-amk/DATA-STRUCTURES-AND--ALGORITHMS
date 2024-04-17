package SORTING;

import java.util.Arrays;
import java.util.Random;

public class SORTING {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE/500;// Maximum range
        int[] arr = new int[n];
        Arrays.fill(arr, 0);// Initialize all elements to 0
        Random rand = new Random();
        int count = 0;
        // Generate unique random numbers
        while (count < n) {
            int num = rand.nextInt(n) + 1; // Generate a random number between 1 and n
            if (arr[num - 1] == 0) { // Check if the number is not yet generated
                arr[num - 1] = num; // Mark the number as generated
                count++;
                System.out.println(num); // Output the unique random number
            }
        }
        quickSort(array, 0, array.length - 1);

        // Print sorted array
        for (int num : array) {
            System.out.print(num + " ");

    }
}