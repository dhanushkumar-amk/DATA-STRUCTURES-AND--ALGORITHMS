package ARRAYS;

import java.util.HashMap;

class  MaximumOccuredInteger{
    static int MaximumOccuredInt(int [] l,int [] r, int n) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i=0; i<n; i++)
        {
            for (int j=l[i]; j<=r[i];j++){
                if (!hashMap.containsKey(j))
                {
                    hashMap.put(j,1);
                }
                else hashMap.put(j, hashMap.get(j)+1);
            }
        }
        int max=0;
        for (int x:hashMap.keySet())
            if(hashMap.get(x)>max){
                max=hashMap.get(x);
            }
        return max;
    }
    public static void main(String[] args) {
        int [] arr1={1,4,3,1};
        int [] arr2={15,8,5,4};
     int result=   MaximumOccuredInt(arr1,arr2,arr1.length);
        System.out.println("\n"+result);
    }
}