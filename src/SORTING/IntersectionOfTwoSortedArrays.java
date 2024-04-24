package SORTING;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {
    static int bs(int arr2[],int key) {
        int l=0;
        int r=arr2.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;

            if(arr2[mid]==key)
                return mid;
            else if(arr2[mid]<key)
                l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
        {
            if(i>0 && arr1[i]==arr1[i-1])
                continue;
            int ind=bs(arr2,arr1[i]);
            if(!(ind==-1)){
                if(arr1[i]==arr2[ind])
                    arrayList.add(arr1[i]);
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2 [] = {2, 4, 6, 7, 8};
        printIntersection(arr1,arr2,arr1.length,arr2.length);
    }
}
