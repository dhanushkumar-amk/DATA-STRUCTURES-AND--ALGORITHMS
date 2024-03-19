package ARRAYS;

public class MaximumSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int arr[] = {2,9,31,-4,21,7};
        int n=arr.length;
        int k=3;
        int j=0;
        for (int i=0; i<=n-k;)
        {
            curSum+=arr[(i)+j++];
            maxSum=Math.max(curSum,maxSum);
            if(j==k) {
                i++;
                j=0;
                curSum=0;
            }
        }
        if(k>n)
            System.out.println("Invalid");
       else System.out.println(maxSum);
    }
}
