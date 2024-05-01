package SORTING;

public class ThreeWayPartition {
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Selecting the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
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
    public static void main(String[] args) {
        int [] arr ={10 ,7, 6 ,1 ,4, 10 ,5 ,2 ,7, 5, 3, 3, 8, 3 ,8};
        int a=5;
        int b=5;
        partition(arr,0,a);
        partition(arr,0,b);
        for (int x:arr) System.out.print(x+" ");
    }
}
