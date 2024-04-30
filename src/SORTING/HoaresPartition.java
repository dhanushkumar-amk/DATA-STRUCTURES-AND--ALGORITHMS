import java.util.Random;

 class HoaresPartitionTest {
    public static void main(String[] args) {
        // Run 1000 test cases
        for (int i = 0; i < 1000; i++) {
            // Generate a random array of random size (up to 100 elements)
            int[] arr = generateRandomArray();

            // Perform partitioning
            int n = arr.length;
            int pivotIndex = partition(arr, 0, n - 1);

            // Validate the partitioning
            boolean isValid = validatePartition(arr, pivotIndex);
            if (!isValid) {
                System.out.println("Test failed for test case:");
                for (int x : arr) {
                    System.out.print(x + " ");
                }
                System.out.println();
                break; // Exit loop if any test fails
            }
        }
    }

    // Generate a random array of random size (up to 100 elements)
    private static int[] generateRandomArray() {
        Random random = new Random();
        int size = random.nextInt(100) + 1; // Random size between 1 and 100
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(); // Random integers
        }
        return arr;
    }

    // Your original partition method
    static int  partition(int arr[], int low, int high) {
        int l=-1;
        int r=high-1;
        int pivot=arr[0];
        while(l<r)
        {
            l++;
            while(l<=r&& arr[l]<pivot)
                l++;
            while(r>=l && arr[r]>pivot)
                r--;
            if(l<=r)
            {
                int x=arr[l];
                arr[l]=arr[r];
                arr[r]=x;
            }
        }
        return r;
    }

    // Validate the partitioning
    private static boolean validatePartition(int arr[], int pivotIndex) {
        for (int i = 0; i < pivotIndex; i++) {
            if (arr[i] >= arr[pivotIndex]) {
                return false;
            }
        }
        for (int i = pivotIndex + 1; i < arr.length; i++) {
            if (arr[i] <= arr[pivotIndex]) {
                return false;
            }
        }
        return true;
    }
}
