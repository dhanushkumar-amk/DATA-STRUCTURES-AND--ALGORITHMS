package SORTING;

public class QuickSort {
    public static void main(String[] args) {
        static void partition(int arr[], int low, int high) {
            int l=-1;
            int r=high-1;
            int pivot=arr[0];
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
}
