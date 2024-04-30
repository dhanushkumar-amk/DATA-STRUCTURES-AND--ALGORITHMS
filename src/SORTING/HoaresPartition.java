package SORTING;

public class HoaresPartition {
    static void hores(int [] arr,int n) {
        int start=-1;
        int end=n+1;
        int pivot=arr[0];
        while(true) {
            do {
                start++;
            }while(arr[start]<=pivot);
            do {
                end--;
            }while(arr[end]>=pivot);
            if(start>=end)
                return;
            int x=arr[start];
            arr[start]=arr[end];
            arr[end]=x;
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