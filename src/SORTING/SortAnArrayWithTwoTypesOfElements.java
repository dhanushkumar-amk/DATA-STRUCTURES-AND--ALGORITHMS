package SORTING;

import java.util.Arrays;

public class SortAnArrayWithTwoTypesOfElements {
    public static void main(String[] args) {
        int [] arr ={15,-3,-2,18};
        Arrays.sort(arr);
        for (int x:arr)
            System.out.print(x+" ");
        int [] arr2 ={15,14,13,12};
        int n2= arr2.length;
        int left=0;
        int right=n2-1;
        while(left<right)
        {
            while((arr2[left]%2)==0)
                left++;
            while(((arr2[right]%2)==1))
                right--;
            if(left<right)
            {
                int x=arr2[left];
                arr2[left]=arr2[right];
                arr2[right]=x;
            }
        }
        System.out.println();
        for (int x:arr2) System.out.print(x+" ");
        
    }
}