package SEARCHING;

public class IndexOfFirstOccurrenceInSorted {
    static int binarySearch() {
        int [] arr ={1,10,10,10,20,20,40};
        int n= arr.length;
        int l=0;
        int r=n-1;
        int x=10;
        int pos=0;
       while (l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==x)
            {
                pos=mid;
                r=mid-1;
            }
            else if(arr[mid]>x)
                r=mid-1;
            else l=mid+1;
        }
        return pos;
    }
    public static void main(String[] args) {
     int res=  binarySearch();
        System.out.println(res);
    }

}