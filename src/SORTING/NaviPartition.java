package SORTING;

public class NaviPartition {
    public static void main(String[] args) {
        int [] arr ={10,9,8,7,6,5,4,3,2,1};
        int [] temp= new int[arr.length];
        int p=4;
        for (int i=0; i< arr.length; i++)
        {
            if(arr[i]<=arr[p])
                temp[i]=arr[i];
        }
        for (int x:temp) System.out.print(x+" ");
    }

}
