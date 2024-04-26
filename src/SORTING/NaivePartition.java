package SORTING;

import java.util.Random;

 class TestNaivePartition {
    public static void main(String[] args) {
        Random random = new Random();

        // Loop for 100 test cases
        for (int testCase = 1; testCase <= 100; testCase++) {
            // Generate random array size between 5 and 20
            int size = random.nextInt(16) + 5;
            int[] arr = new int[size];

            // Fill the array with random integers
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(100); // Generate random integers between 0 and 99
            }

            // Print the original array
            System.out.println("Test Case " + testCase + ": Original Array");
            printArray(arr);

            // Call partition method to partition the array
            partition(arr);

            // Print the partitioned array
            System.out.println("Partitioned Array:");
            printArray(arr);

            System.out.println(); // Add a newline for better readability
        }
    }

    // Helper method to partition an array
    public static void partition(int[] arr) {
        int[] temp = new int[arr.length];
        int p = arr.length - 1;
        int k = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < arr[p])
                temp[k++] = arr[i];

        temp[k] = arr[p];
        k += 1;

        for (int j = 0; j < arr.length; j++)
            if (arr[j] > arr[p])
                temp[k++] = arr[j];

        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
