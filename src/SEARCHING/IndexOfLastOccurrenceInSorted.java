package SEARCHING;
public class IndexOfLastOccurrenceInSorted {
    static int IndexOfLastOccurrenceInSorted() {
        int [] arr ={10,15,20,20,40,40};
        int l=0;
        int r= arr.length-1;
        int x=20;
        int pos=-1;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==x)
            {
                pos=mid;
                l=mid+1;
            }
           else if(arr[mid]>x)
                r=mid-1;
            else l=mid+1;
        }
        return pos;
    }
    public static void main(String[] args) {
        int result= IndexOfLastOccurrenceInSorted();
        System.out.println(result);
    }
}
