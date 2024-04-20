package SORTING;

import java.util.ArrayList;

public class MergeSort {

   static void merge(int [] arr,int low,int mid,int high) {
       ArrayList<Integer> arrayList = new ArrayList<>();
       int k=0;
       int left=low;
       int right=mid+1;
       while(left<=mid &&right<=high)
       {
           if(arr[left]<=arr[right])
               arrayList.add(arr[left++]);
           
           else arrayList.add(arr[right++]);
       }
       while(left<=mid)
           arrayList.add(arr[left++] );

       while(right<=high)
           arrayList.add(arr[right++]);

       for (int i=0; i<arrayList.size();i++)
           arr[i]=arrayList.get(i);
   }
    static void mergeSort(int [] arr,int l,int r) {
        if(l<r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        mergeSort(arr,0, arr.length-1);
        for (int x:arr) System.out.print(x+" ");
    }
}
