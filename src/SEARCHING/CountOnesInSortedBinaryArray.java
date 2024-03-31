package SEARCHING;

public class CountOnesInSortedBinaryArray {
    static int firstAndLastIndexUsingBinarySearch (int [] arr,int n,int x) {
        int l=0;
        int r=n-1;
        int pos=-1;
        while (l<=r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x)
            {
                
            }
        }
    }
    public static void main(String[] args) {
        int [] arr ={0,0,0,1,1,1,1};
      int first=firstAndLastIndexUsingBinarySearch();
      int last=firstAndLastIndexUsingBinarySearch();

    }
}
