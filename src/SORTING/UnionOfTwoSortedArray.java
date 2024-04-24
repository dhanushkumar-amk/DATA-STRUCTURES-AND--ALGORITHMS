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
        TreeSet<Integer> setTwo= new TreeSet();
        ArrayList<Integer> ans= new ArrayList();
        for(int x:arr1)setOne.add(x);
        for(int y:arr2)setTwo.add(y);
        ArrayList<Integer> listOne= new ArrayList<>(setOne);
        ArrayList<Integer> listTwo= new ArrayList<>(setTwo);
        for (int i=0; i<listOne.size(); i++)
        {
            if(i>0 && listOne.get(i)==listOne.get(i-1))
                continue;
            int ind=search(listTwo,listOne.get(i));
            if(ind==-1)
                continue;
            if(listOne.get(i)==listTwo.get(ind))
                ans.add(listOne.get(i));
        }
        for (int y:ans) System.out.print(y+" ");
    }
}
