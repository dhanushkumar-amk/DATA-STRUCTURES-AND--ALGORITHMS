package SORTING;


public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{9, 7, 5, 14, 2, 3, 6, 10};
        int n = arr.length;
        partition(arr, 0, n - 1);
        for (int temp : arr)
            System.out.print(temp + " ");
    }
    static void swap(int arr[] ,int pivot,int j) {
        int x=arr[pivot];
        arr[pivot]=arr[j];
        arr[j]=x;
    }
    static int partition(int[] arr,int low,int high) {
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j)
        {
            i++;
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i>=j)return j;
            swap(arr,i,j);
        }
        swap(arr,low,j);
       return 0;
    }
}