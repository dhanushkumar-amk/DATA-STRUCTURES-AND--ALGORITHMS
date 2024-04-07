package SEARCHING;

public class FindPeakElementSortedArray{
    static int peak(int [] arr){
        int l=0;
        int r=arr.length-1;
        int ans=Integer.MIN_VALUE;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                ans=Math.max(ans,arr[mid]);
            if(arr[mid]>arr[mid-1]) {
                r = mid - 1;
                ans=Math.max(ans,arr[mid]);
            }
            else if(arr[mid]>arr[mid+1]) {
                l = mid + 1;
                ans=Math.max(ans,arr[mid]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,11,2,10};
      int res=  peak(arr);
        System.out.println(res);
    }
}
