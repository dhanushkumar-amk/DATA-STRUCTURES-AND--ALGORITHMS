package ARRAYS;

import com.sun.security.auth.NTSidGroupPrincipal;

public class MinimumConsecutiveFlips {
    static int MinimumConsecutiveFlip(int[] arr, int n) {
        int s=0;
        int e=0;
        for(int i=1; i<n-1;i++)
                if(arr[i]!=arr[i-1])
                    if (arr[i] != arr[0])
                        s+=i;
                       else
                           e+=i-1;
        System.out.println("From "+s+" to "+e);
        return 0;
    }
    public static void main(String[] args) {
        int [] arr ={1,1,1,0,1};
        int n= arr.length;
      int result=  MinimumConsecutiveFlip(arr,n);
//        System.out.println(result);
    }
}