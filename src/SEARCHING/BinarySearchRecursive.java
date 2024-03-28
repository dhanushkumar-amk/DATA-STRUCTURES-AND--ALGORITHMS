package SEARCHING;
public class BinarySearchRecursive {
    static int BinaryRecursive(int l,int r,int []arr,int key) {
        if(l>r)
            return -1;
        int mid=(l+r)/2;
        if(arr[mid]==key)
            return mid;
        if(arr[mid]>key)
            BinaryRecursive(l, mid-1,  arr, key);
         BinaryRecursive(mid+1,r,arr,key);
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {7,10,12,16,22,24,32,40};
        int key=10;
        int n= arr.length;
       int res= BinaryRecursive(0,n-1,arr,key);
        System.out.println(res);

    }
}
