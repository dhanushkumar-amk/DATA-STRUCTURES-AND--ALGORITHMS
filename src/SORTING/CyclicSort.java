package SORTING;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) throws Exception {
        int [] arr ={5,4,3,2,1};
        int i=0;
        int n= arr.length;
        while(i<n) {
            if(arr[i]>n)
                throw new Exception("As per question i can only array them in 1 to n");
            if(arr[i]!=i+1)
            {
                int temp=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[temp-1]=temp;
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
