package ARRAYS;
public class PrefixSum {
    static  void prefixSumAdding(int[]arr) {
        for (int i=1; i< arr.length;++i)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        sum(0,6,arr);
    }
    static void  sum(int i,int j,int [] arr) {
        if(i==0)
            System.out.println(arr[j]);
        else System.out.println(arr[j]-arr[i-1]);
    }

    public static void main(String[] args) {
     int arr[]  ={2,8,3,9,6,5,4};
     prefixSumAdding(arr);
    }
}