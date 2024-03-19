package ARRAYS;

public class MaximumSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int arr[] = {1, 8, 30, -5, 20, 7};
        int n=arr.length;
        int k=4;
        int count=0;
        for (int i=0; i<=n-k;)
        {
            curSum+=arr[(i)+count++];
            maxSum=Math.max(curSum,maxSum);
            if(count==k) {
                i++;
                count=0;
                curSum=0;
            }
        }
        if(k>n)
            System.out.println("Invalid");
       else System.out.println(maxSum);
    }
}
