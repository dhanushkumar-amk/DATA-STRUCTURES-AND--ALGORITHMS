package ARRAYS;

import com.sun.security.auth.NTSidGroupPrincipal;

public class MinimumConsecutiveFlips {
    static int MinimumConsecutiveFlip(int[] arr, int n) {
        int ones = 0;
        int zeros = 0;
        int previous=0;
        for (int i = 1; i < n; i++) {
            previous=arr[i-1];
            if (arr[i]!=previous) {
                if (previous == 1)
                    ones++;
                else zeros++;
            }
            if(i==n-1)
                if(arr[n-1]==1)
                    ones++ ;
                else zeros++;
        }
        boolean Binary=ones>zeros?false:true;
        System.out.println(Binary);
        for(int i=0 ;i<n; i++)
        {

        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr ={1,1,0,0,0,1,0,0,1,1,0,1};
        int n= arr.length;
      int result=  MinimumConsecutiveFlip(arr,n);
//        System.out.println(result);
    }
}