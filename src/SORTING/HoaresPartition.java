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
        if (l < r) {
            int pivot = a[l];
            int i = l;
            int j = r;

            while(i<j) {
                i += 1;
                while(i<=r && a[i] < pivot)
                    i++;
                while(j>=l && a[j] > pivot)
                    j--;

                if(i<j && i<=r){
                    
                }
            }

}