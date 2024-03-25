package ARRAYS;
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={7,10};
        int l=0;
        int r= arr.length-1;
        int key =63;
        while (l<=r)
        {
          int   mid=(l+r)/2;
            if(arr[mid]==key) {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>key) {
                r = mid - 1;
            }
            else if(arr[mid]<key) {
                l = mid + 1;
            }
            else {
                System.out.println(-1);

            }
        }
    }
}