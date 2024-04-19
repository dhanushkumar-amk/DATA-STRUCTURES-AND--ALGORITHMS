package SORTING;

public class InsertionSort {
    static void shift(int [] arr,int n,int end,int start) {
        for (int i=end;i>start;i--)
        {
            arr[i]=arr[i-1];
        }
    }
    static void insert(int []arr,int n) {
        
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        insert(arr, arr.length);
        for (int x:arr) System.out.print(x+" ");
    }
}
