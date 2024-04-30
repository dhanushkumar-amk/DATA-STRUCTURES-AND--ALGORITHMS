package SORTING;


public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{9,7,5,14,2,3,6,10};//
        int n = arr.length;
        partition(arr, 0, n-1 );
        for (int temp : arr)
            System.out.print(temp + " ");
    }
    static void swap(int arr[] ,int x,int j) {
        int temp=arr[x];
        arr[x]=arr[j];
        arr[j]=temp;
    }
    static void QuickSort(int[] arr,int low,int high) {
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j)
        {
            i++;
            while(i<=high && arr[i]<pivot)
                i++;
            while(j>=low && arr[j]>pivot)
                j--;
            if(i<j && low<=high)
                swap(arr, i, j);

        }
        if(arr[j]<pivot)
        swap(arr,low,j);

        QuickSort(arr,low,j-1);
        QuickSort(arr,j,);
    }
}