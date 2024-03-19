package ARRAYS;

public class MaximumSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int [] arr ={2,9,31,-4,21,7};
        int n=arr.length;
        int k=3;
        int count=0;
        for (int i=0; i<n-k-1;)
        {

            curSum+=arr[(i)+count++];

            maxSum=Math.max(curSum,maxSum);
            if(count==k) {
                i++;
                count=0;
                curSum=0;
            }


        }
        System.out.println(maxSum);
    }
}
