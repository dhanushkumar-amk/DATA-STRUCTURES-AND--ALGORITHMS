package SEARCHING;

import java.util.ArrayList;

public class FindIndexesOfsubArrayWithSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> indexes = new ArrayList<>();
        int sum=0;
        int left=0;
        int right =0;

        while(right<n)
        {

            if(arr[right]+sum<s)
            {
                sum+=arr[right];
                right++;
            }else  if(arr[right]+sum==s)
            {
                indexes.add(left+1);
                indexes.add(right+1);
                return indexes;
            }
            else {
                sum-=arr[left];
                left++;
            }
        }
        indexes.add(-1);
        indexes.add(-1);
        return indexes;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(subarraySum(arr, arr.length, 0));
    }
}
