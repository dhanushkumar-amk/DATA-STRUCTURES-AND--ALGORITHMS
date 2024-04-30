package SORTING;

public class HoaresPartition {
    static void hores(int [] arr,int n) {
        int left=0;
        int right=n-1;
        int ind=2;
        int pivot=arr[ind];
        while(true)
        {
            while(arr[left]<pivot)
                left++;
            while(arr[right]>pivot)
                right--;
            if(left>=right)return ;
            int x=arr[left];
            arr[left]=arr[right];
            arr[right]=x;
        }
    }
    public static void main(String[] args) {
        int [] arr ={100,3213,21,321,321,21};
        int n= arr.length;
        hores(arr,n);
        for (int t:arr) System.out.print(t+" ");
        System.out.println();
    }
}