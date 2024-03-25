package ARRAYS;
public class BinarySearch {
    public static void main(String[] args) {

        int [] arr ={7,10};

        int l=0;

        int r= arr.length-1;

        int mid=r/2;

        int key =24;

        while (l<r)
        {
            mid=(l+r)/2;
            if(arr[mid]==key) {
                System.out.println(arr[mid]);
                return;
            }
            else if(arr[mid]>key)
                r=mid;
            else if(arr[mid]<key) l=mid;
                else {
                System.out.println(-1);
                return;
            }
        }
    }
}