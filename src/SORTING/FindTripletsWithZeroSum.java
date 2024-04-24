package SORTING;

import java.util.Arrays;

public class FindTripletsWithZeroSum {
    public static void main(String[] args) {
        int [] arr ={1, 2, 3};
        int n= arr.length;
        Arrays.sort(arr);
        for (int i=0; i<n ;i++)
        {
            if(i>0 && arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0)
                    j++;
                else if(sum>0)
                    k--;
                else {
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }
        System.out.println(-1);
    }
}
