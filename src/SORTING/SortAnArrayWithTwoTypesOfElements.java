package SORTING;

import java.util.Arrays;

public class SortAnArrayWithTwoTypesOfElements {
    public static void main(String[] args) {
        int [] arr ={15,-3,-2,18};
        Arrays.sort(arr);
        for (int x:arr)
            System.out.print(x+" ");
        int [] arr2 ={15,14,13,12};
        int n2= arr2.length;
        int left=0;
        int right=n2-1;
        while(left<right)
        {
            while((arr2[left]%2)==0)
                left++;
            while(((arr2[right]%2)==1))
                right--;
            if(left<right)
            {
                int x=arr2[left];
                arr2[left]=arr2[right];
                arr2[right]=x;
            }
        }
        System.out.println();
        for (int x:arr2) System.out.print(x+" ");
        int [] binaryArr = {0,1,0,1,1,1,1,0,0,0};
        int l=-1;
        int r= binaryArr.length-1;
        while(l<r){
            l++;
            while(arr[l]==0 )
                l++;
            while(arr[r]==1)
                r--;
            if(l<r)
            {
                int x=arr[l];
                arr[l]=arr[r];
                arr[r]=x;
            }
        }
        for (int x:binaryArr) System.out.print(x+" ");
    }
}