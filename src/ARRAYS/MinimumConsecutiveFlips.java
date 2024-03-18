package ARRAYS;

import com.sun.security.auth.NTSidGroupPrincipal;

public class MinimumConsecutiveFlips {
    static int MinimumConsecutiveFlip(int[] arr, int n) {
        int ones = 1;
        int zeros = 1;
        boolean consBool = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i - 1] == 1)
                    ones++;
                else zeros++;
            }
        }
        return Math.min(ones,zeros);

    }
    public static void main(String[] args) {
        int [] arr ={1,1,0,0,0,1,0,0,1,1,0,1};
        int n= arr.length;
      int result=  MinimumConsecutiveFlip(arr,n);
    }
}