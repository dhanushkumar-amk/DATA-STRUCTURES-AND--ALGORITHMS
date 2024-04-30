package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 4, 3, 2, 1};

        int n = arr.length;
        partition(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");

    }


}