package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{9,7,5,14,2,3,6,10};
        int n = arr.length;
        partition(arr, 0, n - 1);
        for (int temp : arr)
            System.out.print(temp + " ");
    }

    static void  partition(int arr[], int l, int h)
    {
        int left=l-1;
        int right=h+1;
        int pivot=arr[l];
        while(true)
        {
            do{
                left++;
            }
            while(arr[left]<pivot);
            do {
                right--;
            }while(arr[right]>pivot);
        }
    }
}