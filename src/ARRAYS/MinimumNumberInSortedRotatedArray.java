package ARRAYS;

public class MinimumNumberInSortedRotatedArray {
    static int binarySearch() {
        return -1;

    }
    public static void main(String[] args) {
       int [] arr ={5,6,7,8,9,10,1,2,3,4};
       int l=0;
       int r= arr.length-1;
       int ans=Integer.MAX_VALUE;
       while(l<=r) {
           int mid=(l+r)/2;
           if(l<=r)
               System.out.println(mid);
           else if(arr[l]<arr[mid] )
           {
               ans=Math.min(ans,arr[mid]);
               
           }
       }
    }
}
