package SEARCHING;
public class MedianOfTwoSortedArrays {
    static double  MedianOfTwoSorted(int [] arr1,int [] arr2) {
        int i=0;
        int j=0;
        int ind=0;
        int [] arr3= new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length )
        {
            if(arr1[i]<arr2[j])
            {
                arr3[ind]=arr1[i];
                ind++;
                i++;
            }
            else {
                arr3[ind]=arr2[j];
                ind++;
                j++;
            }
        }
        int n=arr3.length;
        for (int x:arr3)
            System.out.print(x+" ");
        if ((n&1)==1)
            return arr3[((n-1)/2)];
        return ((double) arr3[(n - 1) / 2] + (double)arr3[((n) / 2)]) / 2;
//        while(i<arr1.length)
//        {
//            arr3[ind]=arr1[i];
//            ind++;
//            i++;
//        }
//        while(j<arr2.length) {
//            arr3[ind]=arr2[j];
//            ind++;
//            j++;
//        }
//
//        if ((n&1)==1)
//            return arr3[((n-1)/2)];
//        return ((double) arr3[(n - 1) / 2] + (double)arr3[((n) / 2)]) / 2;
    }
    public static void main(String[] args) {
        int [] arr1 ={1,2};
        int [] arr2 ={3,4};
      double res =MedianOfTwoSorted(arr1, arr2);
//        System.out.println(res);
    }
}
