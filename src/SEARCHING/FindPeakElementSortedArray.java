package SEARCHING;

public class FindPeakElementSortedArray{
    static int peak(int [] arr){
        int l=0;
        int r=arr.length-1;
        int ans=Integer.MIN_VALUE;
        
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,11,2,10};
      int res=  peak(arr);
        System.out.println(res);
    }
}
