package SEARCHING;
public class SearchInInfiniteSizedArray {
//    static int  InfiniteSearch(int [] arr,int n,int key) {
//
//    }
    static int binarySearch(int [] arr,int n,int l,int r,int key) {
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]  ={ 1,10,12,14,15,40,90,100,120,500};
//      int res=  InfiniteSearch(arr,arr.length,120);
        int res=binarySearch(arr,arr.length,0,arr.length-1,120);
        System.out.println(res);

    }
}
