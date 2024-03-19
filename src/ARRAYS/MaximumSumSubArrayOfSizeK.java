package ARRAYS;

public class MaximumSumSubArrayOfSizeK {
    static void MaxiMumSumSubArrKNaiveApproach() {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int arr[] = {2, 1, 5, 1, 3, 2};
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
    static int MaxiMumSumArraySizeOfK(int[] Arr,int N,int K) {
        int cSum=0;
        int mSum=Integer.MIN_VALUE;
        int i=0;
        while (i<K) {
            cSum += Arr[i];
            i++;
        }
        mSum=Math.max(cSum,mSum);
        for (int j=K-1; j<N-2; j++)
        {

            cSum-=Arr[j-(K-1)];
            mSum=Math.max(cSum,mSum);
            cSum+=Arr[j];
            cSum+=Arr[j+(K-1)];

            j++;


        }
        System.out.println(mSum);
        return -1;

    }
    public static void main(String[] args) {
        int [] arr ={2,9,31,-4,21,7};
        int n= arr.length;
        MaxiMumSumArraySizeOfK(arr,n,3);
    }
}
