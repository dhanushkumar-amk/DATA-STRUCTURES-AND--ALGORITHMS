package SEARCHING;

public class AllocateMinimumPages {
    static int binarySearch(int [] arr,int n,int students) {
        int left=0;
        int right=n-1;
        int Min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int MaxSum=0;
        while(left<right) {
            if (arr[left]  < Min) Min = arr[left];
            MaxSum+=arr[left]+arr[right];
            left++;
            right--;
        }
        int l=Min;
        int r=MaxSum;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(isPossible(arr,n,mid,students))
            {

            }
        }
        return -1;
    }
    static int isPossible(int[] arr,int n,int mid,int students) {
        for (int i=0;i<n;i++)
        {
            
        }
    }

    public static void main(String[] args) {
        int [] arr ={12,34,67,90};
        int students=2;
        int res=binarySearch(arr, arr.length,students);
        System.out.println(res);
    }
}
