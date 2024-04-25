package  SORTING;

import java.util.ArrayList;


    class SORTING
    {
        // arr[]: Input Array
        // N : Size of the Array arr[]
        //Function to count inversions in the array.
        static void mergeSort(long[] arr,int low,int mid,int high) {
            int left = low;
            int right = mid + 1;
            ArrayList<Long> list = new ArrayList<>(); // Use ArrayList<Long> instead of ArrayList<Integer>
            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right])
                    list.add(arr[left++]);
                else
                    list.add(arr[right++]);
            }
            while (left <= mid) list.add(arr[left++]);
            while (right <= high) list.add(arr[right++]);
            for (int i = low; i <= high; i++)
                arr[i] = list.get(i - low);

        }
        static void merge(long arr[],int l,int r) {
            if(l<r)
            {
                int mid=(l+r)/2;
                merge(arr,l,mid);
                merge(arr,mid+1,r);
                mergeSort(arr,l,mid,r);
            }
        }

        public static void main(String[] args) {
            long [] arr ={2,4,1,3,5};
            merge(arr,0, arr.length);
        }
    }
