package SORTING;

public class NaviPartition {
    public static void main(String[] args) {
        int [] arr ={10,9,8,7,6,5,4,3,2,1};
        int [] temp= new int[arr.length];
        int p=3;
        int k=0;
        for (int i=0; i< arr.length; i++)
        {
            if(arr[i]<arr[p])
                temp[k++]=arr[i];
        }
        arr[k]=arr[p];
        for (int j=0; j< arr.length;j++)
        {
            if(arr[j]>arr[p])
                temp[k++]=arr[j];
        }
        for (int x:temp) System.out.print(x+" ");
    }

}
