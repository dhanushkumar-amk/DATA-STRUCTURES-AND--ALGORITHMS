package ARRAYS;
public class BinarySearch {
    static  int  binarySearch(int [] arr) {
        int l=0;
        int r= arr.length-1;
        int key =63;
        while (l<=r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                r = mid - 1;
            } else if (arr[mid] < key) {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8};
       int res= binarySearch(arr);
        System.out.println(res);

    }
}