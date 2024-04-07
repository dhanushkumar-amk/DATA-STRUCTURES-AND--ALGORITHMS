package ARRAYS;

public class MinimumNumberInSortedRotatedArray {
    static int binarySearch() {
        int [] arr ={4,5,6,7,0,1,2};
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
            else if (arr[mid] >= arr[r]){
                r = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch());
    }
}
