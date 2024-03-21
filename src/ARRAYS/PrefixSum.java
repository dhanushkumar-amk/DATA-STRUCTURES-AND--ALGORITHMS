package ARRAYS;
public class PrefixSum {
    static  void prefixSumAdding(int[]arr) {
        for (int i=1; i< arr.length;++i)
        {
            arr[i]=arr[i-1]+arr[i];
        }

    }
    static void  sum() {

    }

    public static void main(String[] args) {
     int arr[]  ={2,8,3,9,6,5,4};
     prefixSumAdding(arr);
    }
}