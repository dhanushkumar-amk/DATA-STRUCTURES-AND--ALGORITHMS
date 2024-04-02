package SEARCHING;
public class SearchInInfiniteSizedArray {
    static int  InfiniteSearch(int [] arr,int n,int key) {
        int l=0;
        int r=1;
        while(l<=r){
            int mid=(r+l)/2;

            if(arr[mid]>key)
             return    binarySearch(arr,n,l,mid,key);
            else {
                l=r+1;
                if(r*r>n)
                    r=Math.min(r*r,n-1);
            }
        }
        return -1;
    }
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
      int res=  InfiniteSearch(arr,arr.length,500);
        System.out.println(res);
    }
}
