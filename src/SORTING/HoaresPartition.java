package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{9, 7, 5, 14, 2, 3, 6, 10};
        int n = arr.length;
        partition(arr, 0, n - 1);
        for (int temp : arr)
            System.out.print(temp + " ");
    }

    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static int partition(int a[], int l, int r) {
        if (l < r) {
            int pivot = a[l];
            int i = l;
            int j = r;

            while (i < j) {
                i += 1;
                while (i <= r && a[i] < pivot)
                    i++;
                while (j >= l && a[j] > pivot)
                    j--;

                if (i < j && i <= r)
                    swap(a, i, j);
            }
        }
        return -1;
    }
}