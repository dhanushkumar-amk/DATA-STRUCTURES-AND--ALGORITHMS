package SORTING;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {

    static int search(ArrayList<Integer> x,int key) {
        int l=0;
        int  r=x.size()-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(x.get(mid)==key)
                return mid;
            else if(x.get(mid)<key)
                l=mid+1;
            else r=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,6,7};
        TreeSet<Integer> setOne= new TreeSet();
        for(int x:arr1)setOne.add(x);
        for (int y:arr2)setOne.add(y);

    }
}
