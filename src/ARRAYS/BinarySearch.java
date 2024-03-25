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
            if (key==arr[mid]) {
                System.out.println("Index  Of "+key+" is "+mid);
                return;
            }
            if(arr[mid]>key)
            {
                r=mid;
                mid=r/2;
            }
            if(arr[mid]<key)
            {
                l=mid;
                mid=l+((r-l)/2);
            }
        }
    }
}