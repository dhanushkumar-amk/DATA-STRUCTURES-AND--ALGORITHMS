package SORTING;

public class HoaresPartition {
    static int[] hores(int [] arr,int n) {
        int left=0;
        int right=n-1;
        int ind=0;
        int pivot=arr[ind];
        while(true)
        {
            while(arr[left]<pivot)
                left++;
            while(arr[right]>pivot)
                right--;
            int x=arr[left];
            arr[left]=arr[right];
            arr[right]=x;
        }
    }
    public static void main(String[] args) {
        int [] arr ={5,3,8,4,2,7,1,10};
        int n= arr.length;
     int temp[] = hores(arr,n);
        System.out.println(temp[0]);
        System.out.println(temp[1]);
        for (int t:arr) System.out.print(t+" ");
        System.out.println();
    }
}