package SEARCHING;

public class CountOnesInSortedBinaryArray {
    static int firstAndLastIndexUsingBinarySearch (int [] arr,int n,int x) {
        int l=0;
        int r=n-1;
        int pos=-1;
        while (l<=r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= x)
            {
                pos=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return pos;
    }
    public static void main(String[] args) {
        int [] arr ={0,0,0,1,1,1,1};
        int n= arr.length;
        int x=0;
      int first=firstAndLastIndexUsingBinarySearch(arr,n,x);
      int last=firstAndLastIndexUsingBinarySearch(arr,n,x+1)-1;
        System.out.println(first);
        System.out.println(last);
        System.out.println(last-first+1);
    }
}
