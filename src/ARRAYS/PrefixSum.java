package ARRAYS;
public class PrefixSum {
    public static void main(String[] args) {
        int [] arr ={2,8,3,9,6,5,4};
        int [] prefixSum= new int[arr.length];
        prefixSum[0]=arr[0];
        int prefix=arr[0];
        for (int i=1; i< arr.length; ++i)
        {
            prefixSum[i-1]+=prefix+arr[i];
            prefix=arr[i];
        }
    }
}