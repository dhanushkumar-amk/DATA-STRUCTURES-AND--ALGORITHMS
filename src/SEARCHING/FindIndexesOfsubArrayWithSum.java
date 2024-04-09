package SEARCHING;

import java.util.ArrayList;

public class FindIndexesOfsubArrayWithSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here\
        ArrayList<Integer> arrl = new ArrayList<Integer>();
        int sum=0;
        int left=0;
        int right=0;
        while(right<n)
        {
            if(arr[right]+sum ==s)
            {
                arrl.add(left+1);
                arrl.add(right+1);
                return arrl;
            }
            if(arr[right]+sum<s) {
                sum += arr[right];
                right++;
            }
            else {
                sum-=arr[left];
                left++;
            }
        }
        return arrl;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(subarraySum(arr, arr.length, 15));
    }
}
