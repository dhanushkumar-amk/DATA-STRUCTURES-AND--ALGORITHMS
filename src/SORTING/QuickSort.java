package SORTING;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr ={}
        quickSort();
    }
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int i=low;
            int j=high;
            int pivot=arr[low];
            while(low<high)
            {
                i++;
                while(i<=high&&arr[i]<pivot)
                    i++;
                while(j>=low&&arr[j]>pivot)
                    j--;
                if(i<j&& i<=high){
                    int x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
            quickSort(arr,low,j-1);
            quickSort(arr,j+1,high);
        }

    }
}
