package ARRAYS;

import com.sun.security.auth.NTSidGroupPrincipal;

public class MinimumConsecutiveFlips {
    static int MinimumConsecutiveFlip(int[] arr, int n) {
        int ones = 1;
        int zeros = 1;
        boolean consBool = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1])
                if (arr[i - 1] == 1)
                    ones++;
                else zeros++;
        }
        if (ones == zeros)
            consBool = false;
        if (ones > zeros)
            consBool = true;
        else consBool = false;
        int ind = 0;
        for (int i = 1; i < n; i++) {
            if (consBool == true) {

                if (arr[i - 1] != arr[i]) {
                    System.out.println("From "+ind+" to "+(i-1));
                    ind=i;
                }
            }
                else {
                    if (arr[i - 1] != arr[i]) {
                        System.out.println("From "+ind+" to "+(i-1));
                        ind=i;
                    }
                }

        }
    return -1;

    }
    public static void main(String[] args) {
        int [] arr ={1,1,0,0,0,1,0,0,1,1,0,1};
        int n= arr.length;
      int result=  MinimumConsecutiveFlip(arr,n);
        System.out.println(result);
    }
}