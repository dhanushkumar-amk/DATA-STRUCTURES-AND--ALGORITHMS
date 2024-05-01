package SORTING;

public class ThreeWayPartition {
    static int partition(int[]arr,int x) {
        int l=0;
        int r=arr.length-1;
        int pivot=x;
        while(l<r)
        {
            l++;
            while(arr[l]<pivot)
                l++;
            while(arr[r]>pivot)
                r--;
            if(l>r)return 0;
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr ={10 ,7, 6 ,1 ,4, 10 ,5 ,2 ,7, 5, 3, 3, 8, 3 ,8};
        int a=5;
        int b=5;
        partition(arr,a);
        for (int x:arr) System.out.print(x+" ");
    }
}
