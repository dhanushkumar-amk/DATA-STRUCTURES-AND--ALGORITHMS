package SORTING;

public class HoaresPartition {
    static void hores(int [] arr,int n) {
        int start=0;
        int end=n-1;
        int pivot=2;
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
        int [] arr ={5,4,3,2,1};
        int n= arr.length-1;
        hores(arr,n);
        for (int x:arr) System.out.print(x+" ");
        System.out.println();
    }
}