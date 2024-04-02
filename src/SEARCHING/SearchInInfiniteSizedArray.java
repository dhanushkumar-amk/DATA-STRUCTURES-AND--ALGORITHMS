package SEARCHING;
public class SearchInInfiniteSizedArray {
    static int  InfiniteSearch(int [] arr,int n,int key) {
        int l=0;
        int r=1;
        while(r>=l){
            int mid=(r+l)/2;
            if(mid>key)
                binarySearch(arr,n,l,mid,key);
            else if(arr[mid]<key)
                r=r*2;
            else l=mid-1;
        }
        return -1;
    }
    static int binarySearch(int [] arr,int n,int l,int r,int key) {
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==)
        }
    }
    public static void main(String[] args) {
        int arr[]  ={ 1,10,12,14,15,40,90,100,120,500};
        InfiniteSearch(arr,arr.length,40);
    }
}
