package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 4, 3, 2, 1};

        int n = arr.length;
        partition(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static int partition(int arr[], int low, int high) {
        int l = low- 1;
        int r = high + 1;
        int pivot = arr[low]; // Choosing the first element as pivot
        while (l < r) {
            l++;
            while (arr[l] < pivot)
                l++;
            r--;
            while (arr[r] > pivot)
                r--;
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        return r;
    }
}