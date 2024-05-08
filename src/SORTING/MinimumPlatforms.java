package SORTING;

import java.util.Arrays;

public class MinimumPlatforms {
    static int findPlatform(int start[], int stop[], int n)
    {
        // add your code here
        Arrays.sort(start);
        Arrays.sort(stop);
        int j=0;
        int i=1;
        int res=1;
        int count=1;
        while(i<n && j<n)
        {
            if(start[i]<=stop[j])
            {
                i++;
                count++;
            }
            else {
                count--;
                j++;
            }
            res=Math.max(count,res);
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}
