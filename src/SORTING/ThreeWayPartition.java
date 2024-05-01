package SORTING;

public class ThreeWayPartition {
    static void partition(int[]arr,int x) {
        int left=-1;
        int right=arr.length;
        while(true)
        {
            do{
                left++;
            }while(arr[left]<x);
            do{
                right--;
            }while(arr[right]>x);
            if(left>=right)return ;
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr ={10, 5, 6, 3, 20, 9, 30};
        int a=5;
        int b=20;
        partition(arr,a);
        partition(arr,b);
        for (int x:arr) System.out.print(x+" ");
    }
}
