package SORTING;

public class HoaresPartition {
    static void hores(int [] arr,int n) {
        int start=0;
        int end=n-1;
        int pivot=arr[0];
        while(true) {
            while (arr[start] < pivot)
                start++;
            while (arr[end] > pivot)
                end--;
            if (start >= end)
                return;
            int x = arr[start];
            arr[start] = arr[end];
            arr[end] = x;
        }
    }
    public static void main(String[] args) {
        int [] arr ={9,7,5,14,2,3,6,10};
        int n= arr.length-1;
        hores(arr,n);
        for (int x:arr) System.out.print(x+" ");
        System.out.println();
    }
}