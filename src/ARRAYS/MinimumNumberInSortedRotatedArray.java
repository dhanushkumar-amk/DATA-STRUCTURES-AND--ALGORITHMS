package ARRAYS;

public class MinimumNumberInSortedRotatedArray {
    static int binarySearch() {
        int [] arr ={1,2,3,4,5};
        int l=0;
        int r= arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=r) {
            int mid=(l+r)/2;
            if(arr[l]<=arr[r])
                return mid;
            else if(arr[l]<=arr[mid] )
            {
                l=mid+1;
            }
            else {
                r = mid - 1;

            }
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(binarySearch());
    }
}
