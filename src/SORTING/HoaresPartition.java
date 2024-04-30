package SORTING;

public class HoaresPartition {
    static void hores(int [] arr,int n) {
        int left=0;
        int right=n-1;
        int pivot=6;
        while(true)
        {
            while(arr[left]<pivot)
                left++;
            while(arr[right]>pivot)
                right--;
            if(left>=right)return;
            int x=arr[left];
            arr[left]=arr[right];
            arr[right]=x;
        }
    }
    public static void main(String[] args) {
        int [] arr ={9,7,5,14,2,3,6,10};
        int n= arr.length;
        hores(arr,n);
        for (int x:arr) System.out.print(x+" ");
        System.out.println();
    }
}