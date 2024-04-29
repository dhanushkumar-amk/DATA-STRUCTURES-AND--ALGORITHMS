package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int [] arr ={5,3,8,4,2,7,1,10};
        int n= arr.length;
        int start=-1;
        int end=n;
        int pivot=arr[4];
        while(true) {
            do {
                start++;
            }while(arr[start]<pivot);
            do {
                end--;
            }while(arr[end]>pivot);
            if(start<=end)
                return;
            int x=arr[start];
            arr[start]=arr[end];
            arr[end]=x;
        }
    }
}