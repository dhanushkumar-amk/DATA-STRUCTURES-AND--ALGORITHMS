package SEARCHING;

import java.util.ArrayList;

public class FindIndexesOfsubArrayWithSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here\
        ArrayList<Integer> arrl = new ArrayList<Integer>();
        int sum=0;
        int j=0;
        sum=arr[j];
        int i=1;
        while(i<n)
        {
            if(sum==s){
                arrl.add(i);
                arrl.add(j);
                return arrl;
            }
            if(arr[i]+arr[j]<=s){
                sum+=arr[i];
                i++;
            }
            else {
                sum-=arr[j];
                j++;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
