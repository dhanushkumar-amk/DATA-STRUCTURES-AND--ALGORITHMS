package SORTING;

public class LomutoPartition {
    public static void main(String[] args) {
        int [] arr= new int[] {12,9,7,15,10};
        int n=arr.length;
        int pivot=n-1;
        int j=0;
        int i=0;
        for (; j<pivot; j++)
        {
            if(arr[j]<=arr[pivot])
            {
                int x=arr[i];
                arr[i]=arr[j];
                arr[j]=x;
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[pivot];
        arr[pivot]=temp;
        for (int x:arr) System.out.print(x+" ");
    }
}
