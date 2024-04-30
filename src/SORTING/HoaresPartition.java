package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 4, 3, 2, 1};

        int n = arr.length;
        partition(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static int partition(int arr[], int l, int h) {
        int left=1;
        int right=h-1;
        int pivot=arr[l];
        while(left<right)
        {
            while(arr[left]<pivot)
                left++;
            while(arr[right]<pivot)
                right--;
            if(left<=right)
            {
                int x=arr[left];
                arr[left]=arr[right];
                arr[right]=x;
            }
        }
        
    }
}