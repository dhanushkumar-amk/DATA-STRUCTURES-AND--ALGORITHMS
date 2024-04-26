package SORTING;
import java.util.Random;
public class NaivePartition {
    st
    public static void main(String[] args) {
    }

}


public class TestNaivePartition  extends  SORTING{
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

            // Call NaivePartition to partition the array
            System.out.println("Partitioned Array:");
            partition(arr);
            printArray(arr);

            System.out.println(); // Add a newline for better readability
        }
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
