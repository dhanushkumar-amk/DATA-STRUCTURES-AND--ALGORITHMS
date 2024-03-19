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
            if(count==3) {
                i++;
                count=0;
            }
            if(curSum>maxSum)
                maxSum=curSum;
        }
        System.out.println(maxSum);
    }
}
