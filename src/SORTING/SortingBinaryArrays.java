package SORTING;

public class SortingBinaryArrays {
    public static void main(String[] args) {


        for (int x:arr2) System.out.print(x+" ");
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
    }
}
