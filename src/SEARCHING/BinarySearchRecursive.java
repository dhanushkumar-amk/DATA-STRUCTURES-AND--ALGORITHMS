package SEARCHING;
public class BinarySearchRecursive {
    static int BinaryRecursive(int l,int r,int mid,int []arr,int key) {
        if(l>r||key==arr[mid])
            return mid;
        mid= (l+r)/2;
        
        if(arr[mid]<key) {
            BinaryRecursive(l, r, mid, arr, key);
        }
    }
    public static void main(String[] args) {
        int [] arr = {7,10,12,16,22,24,32,40};
        int key=10;
        int n= arr.length;
        BinaryRecursive(0, arr.length-1,arr,key);
    }
}
