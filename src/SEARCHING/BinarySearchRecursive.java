package SEARCHING;
public class BinarySearchRecursive {
    static int BinaryRecursive(int l,int r,int []arr,int key) {
        if(l>r)
            return -1;
        int mid=(l+r)/2;
        if(arr[mid]==key)
            return mid;
       else  if(arr[mid]>key)
           return BinaryRecursive(l, mid-1,  arr, key);
        else
            return  BinaryRecursive(mid+1,r,arr,key);
    }
    static int re() {
        long l=0;
        long r=n-1;
        long ans=-1;
        for(int i=0 ;i<n; i++)
        {
            long mid=(l+r)/2;
            if(arr[(int)mid]==x)
                return(long) mid;
            if(arr[(int)mid]<=x)
                return (long)mid;
            else if(arr[(int)mid]>x)
                r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {7,10,12,16,22,24,32,40};
        int key=12;
        int n= arr.length;
       int res= BinaryRecursive(0,n-1,arr,key);
        System.out.println(res);

    }
}
