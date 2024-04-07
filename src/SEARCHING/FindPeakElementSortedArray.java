package SEARCHING;

public class FindPeakElementSortedArray{
    static int peak(int [] arr){
        int l=0;
        int r=arr.length-1;
        while (l<=r)
        {
            int mid=(l+r)/2;

            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            if(arr[mid]>arr[mid-1])
                r=mid-1;
            else if(arr[mid]>arr[mid+1])
                l=mid+1;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,11,2,10};
      int res=  peak();
        System.out.println(res);
    }
}
