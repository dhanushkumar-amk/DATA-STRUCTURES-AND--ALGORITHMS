package SEARCHING;
public class SmallestMissingPositive {
    static int missingNumber(int arr[], int size) {
        int miss = 0;
        int n=size;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]==1)
                miss=1;
        }
        if(miss==0)
            return 1;
        for (int i=0; i<n; i++)
        {
            if(arr[i]<=0 || arr[i]>=n)
                arr[i]=1;
        }
        for (int i=0; i<n; i++)
        {
            arr[arr[i]-1]=arr[i];
        }
        for (int i=0; i<n; i++)
        {
            if(arr[i]!=i+1)
                return i+1;
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {0,-10,1,3,-20};
        int n = arr.length;
        int res = missingNumber(arr, n);
        System.out.println(res);
    }
}