package SORTING;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,6,7};
        TreeSet<Integer> setOne= new TreeSet();
        TreeSet<Integer> setTwo= new TreeSet();
        ArrayList<Integer> list= new ArrayList();
        for(int x:arr1)setOne.add(x);
        for(int y:arr2)setTwo.add(y);
        
    }
}
