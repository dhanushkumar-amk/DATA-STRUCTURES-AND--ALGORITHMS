package ARRAYS;
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={7,10,12,16,22,24,32,40};
        int l=0;
        int r= arr.length-1;
        int mid=r/2;
        int key =12;
        while(l<r)
        {
            if(arr[mid]==key) {
                System.out.println(l);
                return;
            }
            if(arr[mid]>key) {
                r = mid;
                mid=r/2;
            }

            if(arr[mid]<key) {
                l = mid;
                mid=r/2;
            }
        }

    }
}