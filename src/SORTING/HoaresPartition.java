package SORTING;

public class HoaresPartition {
    static void hores(int [] arr,int n) {
        int left=0;
        int right=n-1;
        int pivot=5;
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
        int [] arr ={5,3,8,4,2,7,1,10};
        int n= arr.length;
        hores(arr,n);
        for (int x:arr) System.out.print(x+" ");
        System.out.println();
    }
}