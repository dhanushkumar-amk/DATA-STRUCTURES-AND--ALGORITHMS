package SORTING;

public class ThreeWayPartition {
    static int partition(int[]arr,int x,int l) {
        int left=l-1;
        int right=arr.length;
        while(true)
        {
            do{
                left++;
            }while(arr[left]<x);
            do{
                right--;
            }while(arr[right]>x);
            if(left>=right)return left;
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr ={10 ,7, 6 ,1 ,4, 10 ,5 ,2 ,7, 5, 3, 3, 8, 3 ,8};
        int a=5;
        int b=5;
       int ans= partition(arr,a,0);
       partition(arr,b,ans);
        System.out.println(ans);

//        partition(arr,b);
        for (int x:arr) System.out.print(x+" ");
    }
}
