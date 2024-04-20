package SORTING;
public class MergeSort {
    static int [] dup = new int[5];
    static int k=0;
   static void shift(int [] arr,int n,int i,int j) {
       while(i<n && j<n)
       {
           if(arr[i]<arr[j])
               dup[k++]=arr[i++];
           else
               dup[k++]=arr[j++];
       }
       while(i<n)
           dup[k++]=arr[i++];
       while(j<n)
           dup[k++]=arr[j++];
       k=0;
    }
    static void mergeSort(int [] arr,int l,int r) {
        if(l<r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            shift(arr, arr.length, l, r);
        }
    }
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        mergeSort(arr,0, arr.length-1);
        for (int d :dup) System.out.print(d+" ");
    }
}
