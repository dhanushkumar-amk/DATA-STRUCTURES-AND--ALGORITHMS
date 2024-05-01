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
        int [] arr ={5,4,3,2,1};
        int a=
        partition();
    }
}
