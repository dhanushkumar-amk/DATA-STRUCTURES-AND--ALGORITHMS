package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> arrayList = new ArrayList();
        int i=0;
        int cSum=0;
        int j=i;
        while (i<n)
        {
            if(cSum==s) {
                arrayList.add(i+1);
                arrayList.add(j-1);
                break;
            }
            if(cSum>s||j==n-1){
                i++;
                j=i;
                cSum=0;
                continue;
            }
            cSum+=arr[j];
            j++;

        }
        if(arrayList.size()==0){
            arrayList.add(-1);
            return arrayList;

        }
        return arrayList;

    }
    public static void main(String[] args) {
        int [] arr ={1,0};
        int n= arr.length;;
        int s=0;
     for(int x:   subarraySum(arr,n,s)){
         System.out.print(x+" ");
     }
    }
}
