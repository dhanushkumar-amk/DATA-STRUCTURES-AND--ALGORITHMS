package SEARCHING;

public class FindPeakElementSortedArray{
    static int peak(int [] arr){
        int l=0;
        int r=arr.length-1;
        int ans=Integer.MIN_VALUE;
        int n= arr.length;
        while(l<=r){
            int mid=(l+r)/2;
            if(mid==0 || arr[mid-1]<=arr[mid] && arr[mid+1]<=arr[mid])
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3};
      int res=  peak(arr);
        System.out.println(res);
    }
}
