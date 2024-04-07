package SEARCHING;

public class FindPeakElementSortedArray{
    static int peak(int [] arr){
        int l=0;
        int r=arr.length-1;
        int ans=Integer.MIN_VALUE;
        int n= arr.length;
        while(l<=r){
            int mid=(l+r)/2;

            if(mid>0 && mid<n) {
                if (arr[mid - 1] <= arr[mid] && arr[mid + 1] <= arr[mid])
                    return  mid;

                if (arr[mid - 1] > arr[mid]) {
                    r = mid - 1;
                    ans = Math.max(ans, mid);
                } else {
                    l = mid + 1;
                    ans = Math.max(ans, mid);
                }
                if(mid==0)
                    return   arr[mid]>arr[mid+1]?mid:mid+1;
                if(mid==n-1)
                    return   arr[mid]>arr[mid-1]?mid:mid-1;
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
