package SORTING;

import java.util.Arrays;

public class SortAnArrayWithTwoTypesOfElements {
    public static void main(String[] args) {
        int [] arr ={15,-3,-2,18};
        Arrays.sort(arr);
        for (int x:arr)
            System.out.print(x+" ");
    }
}