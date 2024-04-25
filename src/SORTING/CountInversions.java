package SORTING;

import java.util.ArrayList;

public class CountInversions {
    public static void main(String[] args) {
        int [] arr ={2,4,1,3,5};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i=0; i< arr.length; i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for (int j=i+1; j< arr.length; j++)
            {
                if(arr[i]>arr[j]) {
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                }
            }
            list.add(temp);
        }
        for (int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
