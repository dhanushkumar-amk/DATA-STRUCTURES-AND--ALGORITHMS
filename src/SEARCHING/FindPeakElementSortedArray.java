package SEARCHING;

public class FindPeakElementSortedArray{
    static int peak(int [] arr){
        int l=0;
        int r=arr.length-1;
        int ans=Integer.MIN_VALUE;
        int n= arr.length;
        while(l<=r){
            int mid=(l+r)/2;
            if(mid==0)
              return   ans=arr[mid]>arr[mid+1]?0:ans;
            if(mid==n-1)
              return   ans=arr[mid]>arr[mid-1]?n-1:ans;
            if(arr[mid-1]<=arr[mid] && arr[mid+1]<=arr[mid])
                return ans=mid;
            if(arr[mid-1]>arr[mid]) {
                r = mid - 1;
                ans=Math.max(ans,mid);
            }
            else  {
                l = mid + 1;
                ans=Math.max(ans,mid);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3};
      int res=  peak(arr);
        System.out.println(res);
    }
}
