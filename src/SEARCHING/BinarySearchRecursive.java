package SEARCHING;
public class BinarySearchRecursive {
    static int BinaryRecursive(int l,int r,int mid,int []arr,int key) {
        if(l>r||key==arr[mid])
            return mid;
        mid= (l+r)/2;

        if(arr[mid]>key)
            BinaryRecursive(l, r-1, mid, arr, key);
         BinaryRecursive(l+1,r,mid,arr,key);
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {7,10,12,16,22,24,32,40};
        int key=10;
        int n= arr.length;
       int res= BinaryRecursive(0,n-1,0,arr,key);
        System.out.println(res);

    }
}
