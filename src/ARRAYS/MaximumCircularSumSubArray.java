package ARRAYS;
public class MaximumCircularSumSubArray {
    static void MaxiMumCircularSumSubArray(int[] arr,int n) {
        int curMax=arr[0];
        int curPos=arr[0];
        int curMin=arr[0];
        int curNeg=arr[0];
        for (int i=1; i<n; i++)
        {
            if (curPos>=0)
                curMax+=arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,-2,3,4};
        int n= arr.length;
        MaxiMumCircularSumSubArray(arr,n);
    }
}
