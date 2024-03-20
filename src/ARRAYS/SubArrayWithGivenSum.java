package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> arrayList = new ArrayList();

        int i = 0;
        int j = 0;
        int sum = arr[0];
        while (j < n) {
            if (sum == s) {
                arrayList.add(i + 1);
                arrayList.add(j + 1);
                return arrayList;
            }
            if (sum < s) {
                j++;
                sum += arr[j];
                continue;
            }
            if (sum > s) {
                sum -= arr[i];
                i++;
                continue;
            }
        }
        arrayList.add(-1);
        return arrayList;
    }

    public static void main(String[] args) {
        int [] arr ={10};
        int n= arr.length;;
        int s=0;
     for(int x:   subarraySum(arr,n,s)){
         System.out.print(x+" ");
     }
    }
}
