package ARRAYS;
public class PrefixSum {
    static int []prefixSumAdding() {
        int [] arr ={2, 8, 3, 9, 6, 5, 4};
        for (int i=1; i< arr.length; i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        for (int x:arr)
            System.out.print(x+" ");
        System.out.println();
        System.out.println(arr[3]-arr[0]);
        return arr;
    }
    static  void prefixSum (int [] arr) {
        System.out.println(sum(arr,0,2));
        System.out.println(sum(arr,1,3));
        System.out.println(sum(arr,2,6));
    }
    static int sum(int [] arr,int i,int j) {
        int sum=0;
        for (;i<=j;i++)
        {
         sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
     int arr[]  ={2,8,3,9,6,5,4};
//     prefixSum(arr);
     prefixSumAdding();
    }
}