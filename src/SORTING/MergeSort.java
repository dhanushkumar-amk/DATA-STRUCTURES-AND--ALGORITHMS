package SORTING;

public class MergeSort {

   static void merge(int [] arr,int l,int mid,int r) {
       int [] temp =new int[arr.length];
       int k=0;
       while(l<=mid && mid+1<=r)
       {
           if(arr[l]<=arr[mid])
           {
               temp[k++]=arr[l++];
           }
           else {
               temp[k++]=arr[mid+1];
               mid++;
           }
       }
       while(l<=mid)
           temp[k++]=arr[l++];
       while(mid+1<=r) {
           temp[k++] = arr[mid + 1];
           mid++;
       }


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
