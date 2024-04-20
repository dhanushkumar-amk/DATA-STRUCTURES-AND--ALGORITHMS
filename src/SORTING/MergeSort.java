package SORTING;
public class MergeSort {

   static void merge(int [] arr,int ) {

   }
    static void mergeSort(int [] arr,int l,int r) {
        if(l<r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge();
        }
    }
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        mergeSort(arr,0, arr.length-1);
        for (int d :dup) System.out.print(d+" ");
    }
}
