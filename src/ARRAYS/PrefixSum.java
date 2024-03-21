package ARRAYS;
public class PrefixSum {
    static int []prefixSumAdding() {
        int [] arr ={5,3,2,4,1,8,6,10};
        int [] prefixSum= new int[arr.length];
        prefixSum[0]=arr[0];
        for (int i=1; i< arr.length; ++i)
        {
            prefixSum[i]=prefixSum[i]+prefixSum[i-1]+arr[i];
        }
        return  prefixSum;
    }
    static  void prefixSum (int [] arr) {
        System.out.println(sum(arr,0,2));
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
     prefixSum(arr);
    }
}