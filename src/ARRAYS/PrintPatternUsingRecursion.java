package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintPatternUsingRecursion {
    static void pattern(int N, ArrayList<Integer> arrayList) {
        if(N<0)
            return;
        arrayList.add(N);
        pattern(N-5,arrayList);
       arrayList.add(N);

    }
    public static void main(String[] args) {
         int n=16;
         ArrayList<Integer> integerArrayList = new ArrayList<>();
         pattern(n,integerArrayList);
         for (int x:integerArrayList)
             System.out.print(x+" ");
    }
}
