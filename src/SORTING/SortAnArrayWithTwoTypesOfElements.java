package SORTING;

import java.util.Arrays;

public class SortAnArrayWithTwoTypesOfElements {
    public static void main(String[] args) {
        int [] arr ={15,-3,-2,18};
        Arrays.sort(arr);
        for (int x:arr)
            System.out.print(x+" ");
        int [] arr2 ={15,14,13,12};
        // 12 13 14 15
        // e   o  e  o
        //
        for (int i=0; i< arr2.length; i++)
        {
            if((arr[i]&1)==1)
        }
    }
}