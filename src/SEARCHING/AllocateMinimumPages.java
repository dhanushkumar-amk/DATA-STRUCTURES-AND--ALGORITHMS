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
        int res=arr[0];
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(isPossible(arr,n,mid,students))
            {
                res=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return res;
    }
    static boolean isPossible(int[] arr,int n,int mid,int students) {
        int sum=0;
        int s=1;
        for (int i=0;i<n;i++)
        {
            if(sum+arr[i]<=mid)
                sum+=arr[i];
            else {
                if(s<students) {
                    sum = arr[i];
                    s++;
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr ={12,34,67,90};
        int students=2;
        int res=binarySearch(arr, arr.length,students);
        System.out.println(res);
    }
}
