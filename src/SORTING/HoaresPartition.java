package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 4, 3, 2, 1};

        int n = arr.length;
        partition(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static void partition(int arr[], int low, int high) {
        int l=0;
        int r=high-1;
        int pivot=arr[1];
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
    }
}