package SEARCHING;
public class MedianOfTwoSortedArrays {
    static double MedianOfTwoSorted(int [] arr1,int [] arr2) {
        int i=0;
        int j=0;
        int ind=0;
        int [] arr3= new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length)
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
        for (int x:arr3)
            System.out.print(x+" ");
        return 10;
    }
    public static void main(String[] args) {
        int [] arr1 ={1,2};
        int [] arr2 ={3,4};
        MedianOfTwoSorted();
    }
}
