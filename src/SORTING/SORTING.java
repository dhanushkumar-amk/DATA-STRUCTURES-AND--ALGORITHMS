import java.util.ArrayList;

class SORTING {
    static void mergeSort(long[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Long> list = new ArrayList<>(); // Changed from ArrayList<Integer> to ArrayList<Long>
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                list.add(arr[left++]);
            else
                list.add(arr[right++]);
        }
        while (left <= mid) list.add(arr[left++]);
        while (right <= high) list.add(arr[right++]);
        for (int i = low; i <= high; i++)
            arr[i] = list.get(i - low); // Changed to i - low to fix Index Out of Bounds issue
    }

    static void merge(long arr[], int l, int r) {
        if (l < r) { // Added a base case to avoid infinite recursion
            int mid = (l + r) / 2;
            merge(arr, l, mid);
            merge(arr, mid + 1, r);
            mergeSort(arr, l, mid, r); // Changed from mergeSort to mergeSort to fix the method call
        }
    }

    public static void main(String[] args) {
        long[] arr = {2, 4, 1, 3, 5};
        merge(arr, 0, arr.length - 1); // Changed from arr.length to arr.length - 1
        for (long num : arr) {
            System.out.print(num + " ");
        }
    }
}
