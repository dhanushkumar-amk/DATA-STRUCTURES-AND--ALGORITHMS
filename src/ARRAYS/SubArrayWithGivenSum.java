package ARRAYS;
public class SubArrayWithGivenSum {
    static int  SubArrayWithGivenSum(int [] arr,int n ,int s) {
        int i=0;
        int cSum=Integer.MIN_VALUE;
        int j=i;
        while (i<n)
        {
            if(cSum>s||j==n-1){
                i++;
                j=i;
                cSum=Integer.MIN_VALUE;
                continue;
            }
            cSum+=arr[j];
            j++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,7,5};
        int n= arr.length;;
        int s=12;
        SubArrayWithGivenSum(arr,n,s);

    }
}
