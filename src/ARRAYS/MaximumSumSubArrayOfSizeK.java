package ARRAYS;

public class MaximumSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int [] arr ={2,9,31,-4,21,7};
        int n=arr.length;
        int k=3;
        int count=0;
        for (int i=0; i<n-k;)
        {

            curSum+=arr[count++];
            maxSum=Math.max(curSum,maxSum);
            if(count==k) {
                i++;
                count=i;
            }


        }
        System.out.println(maxSum);
    }
}
