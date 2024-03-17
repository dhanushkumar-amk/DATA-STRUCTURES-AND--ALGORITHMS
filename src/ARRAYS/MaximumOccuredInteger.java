package ARRAYS;

import java.util.HashMap;

class  MaximumOccuredInteger{
    static int MaximumOccuredInt(int [] l,int [] r, int n) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i=0; i<n; i++)
        {
            for (int j=l[i]; j<r[i];j++){
                hashMap.put(j,j);
            }
        }
        System.out.println(hashMap);
        return -1;
    }
    public static void main(String[] args) {
        int [] arr1={1,4,3,1};
        int [] arr2={15,8,5,4};
     int result=   MaximumOccuredInt(arr1,arr2,arr1.length);
        System.out.println("\n"+result);
    }
}