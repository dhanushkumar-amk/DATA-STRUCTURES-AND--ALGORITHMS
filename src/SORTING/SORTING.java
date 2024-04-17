package SORTING;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SORTING {
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Recursive function to perform Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);
            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int n =23490; // Maximum range
        int[] arr = new int[n];
        Set<Integer> set = new HashSet<>();
        Random rand = new Random();
        int count = 0;
        // Generate unique random numbers
        while (count < n) {
            int num = rand.nextInt(n) + 1; // Generate a random number between 1 and n
            if (!set.contains(num)) { // Check if the number is not yet generated
                arr[count++] = num; // Mark the number as generated
                set.add(num);
            }
        }

        // Measure time before sorting
        long startTime = System.nanoTime();

        quickSort(arr, 0, arr.length - 1);

        // Measure time after sorting
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println("\nSorting time: " + duration + " milliseconds");
    }
}

