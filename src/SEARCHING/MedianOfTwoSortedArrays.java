package SEARCHING;
public class MedianOfTwoSortedArrays {
    static double  MedianOfTwoSorted(int [] arr1,int [] arr2) {
        int i=0;
        int j=0;
        int ind=0;
        int [] arr3= new int[arr1.length+arr2.length];
        while(i<(arr1.length)/2 && j<(arr2.length/2))
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
        while(i<arr1.length)
        {
            arr3[ind]=arr1[i];
            ind++;
            i++;
        }
        while(j<arr2.length) {
            arr3[ind]=arr2[j];
            ind++;
            j++;
        }
        int n=arr3.length;

    }
    public static void main(String[] args) {
        int [] arr1 ={1,2};
        int [] arr2 ={3,4};
      double res =MedianOfTwoSorted(arr1, arr2);
        System.out.println(res);
    }
}
