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
        int left=l;
        int right=h-1;
        int pivot=arr[l];
        while(left<right)
        {
            left++;
            while(left<h && arr[left]<pivot)
                left++;
            while(right>l&& arr[right]<pivot)
                right--;
            if(left<=right)
            {
                int x=arr[left];
                arr[left]=arr[right];
                arr[right]=x;
            }
        }
        return right;
    }
}