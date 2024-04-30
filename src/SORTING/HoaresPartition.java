package SORTING;


public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{9, 7, 5, 14, 2, 3, 6, 10};
        int n = arr.length;
        partition(arr, 0, n );
        for (int temp : arr)
            System.out.print(temp + " ");
    }
    static void swap(int arr[] ,int x,int j) {
        int temp=arr[x];
        arr[x]=arr[j];
        arr[j]=temp;
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