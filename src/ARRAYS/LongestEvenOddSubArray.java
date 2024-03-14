package ARRAYS;
public class LongestEvenOddSubArray {
    static void LongestEvenOddSubarray (int [] arr){
        int n= arr.length;
        int max=arr[0];
        int sum=
        for(int i=0; i<n; i++)
        {
            if (arr[i]%2==0)
        }
    }
    public static void main(String[] args) {
        int [] arr = {10,12,14,7,8};
        LongestEvenOddSubarray(arr);
    }
}
