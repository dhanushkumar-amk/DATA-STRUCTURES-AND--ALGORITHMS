package SEARCHING;

public class FindPeakElementSortedArray{
    static int peak(int [] arr){
        int l=0;
        int r=arr.length-1;
        int ans=Integer.MIN_VALUE;
        int n= arr.length;;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==0)
              return   ans=arr[mid]>arr[mid+1]?arr[0]:ans;
            if(arr[mid]==n-1)
              return   ans=arr[mid]>arr[mid-1]?arr[n-1]:ans;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return ans=arr[mid];
            if(arr[mid]<arr[mid-1]) {
                r = mid - 1;
                ans=Math.max(ans,arr[mid]);
            }
            else if(arr[mid]<arr[mid+1]) {
                l = mid + 1;
                ans=Math.max(ans,arr[mid]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
      int res=  peak(arr);
        System.out.println(res);
    }
}
