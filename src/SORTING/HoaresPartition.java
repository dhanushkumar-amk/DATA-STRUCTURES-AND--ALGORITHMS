package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{9, 7, 5, 14, 2, 3, 6, 10};
        int n = arr.length;
        partition(arr, 0, n - 1);
        for (int temp : arr)
            System.out.print(temp + " ");
    }
    static int partition(int[] arr,int low,int high) {
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j)
        {
            
        }
    }
}