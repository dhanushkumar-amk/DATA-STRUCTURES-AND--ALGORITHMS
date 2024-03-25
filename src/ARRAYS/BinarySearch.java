package ARRAYS;
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={7,10};
        int l=0;
        int r= arr.length-1;
        int key =6342;
        while (l<r)
        {
          int   mid=(l+r)/2;
            if(arr[mid]==key) {
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>key)
                r=mid;
            else if(arr[mid]<key)
                l=mid;
            else {
                System.out.println(-1);
                return;
            }
        }
    }
}