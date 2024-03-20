package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> arrayList = new ArrayList();
        int i=0;
        int cSum=arr[0];
        int j=0;
        while (i<n) {
            if (cSum == s) {
                arrayList.add(i+1);
                arrayList.add(j+1);
                return arrayList;
            }
            if(cSum<s)
            {
                j++;
                cSum+=arr[j];
            }
            else {
                arrayList.clear();
                i++;
                j=i;
            }
        }
        if(arrayList.size()==0)
        {
            arrayList.add(-1);
            return arrayList;
        }
        else return arrayList;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,7};
        int n= arr.length;;
        int s=3;
     for(int x:   subarraySum(arr,n,s)){
         System.out.print(x+" ");
     }
    }
}
