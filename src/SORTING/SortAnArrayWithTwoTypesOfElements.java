package SORTING;

public class SortAnArrayWithTwoTypesOfElements {
    public static void main(String[] args) {
        int [] arr ={15,-3,-2,18};
        int lef=-1;
        int rig= arr.length-1;
        while(lef<rig)
        {
            lef++;
            while(arr[lef]<0)
                lef++;
            while(arr[rig]>0)
                rig--;
            if(lef<rig)
            {
                int x=arr[lef];
                arr[lef]=arr[rig];
                arr[rig]=x;
            }
        }
        for (int x:arr) System.out.print(x+" ");
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
        int [] binaryArr = {0,0};
        int l=-1;
        int r= binaryArr.length-1;
        while(l<=r) {
            l++;
            while(binaryArr[l]==0 && l<r)
                l++;
            while(binaryArr[r]==1 && l<r)
                r--;
            if(l<=r)
            {
                int x=binaryArr[l];
                binaryArr[l]=binaryArr[r];
                binaryArr[r]=x;
            }
        }
        System.out.println();
        for (int x:binaryArr) System.out.print(x+" ");
    }
}