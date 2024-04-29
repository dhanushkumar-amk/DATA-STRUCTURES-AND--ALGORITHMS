package SORTING;

public class LomutoPartition {
    public static void main(String[] args) {
        int [] arr= new int[] {10,80,30,90,40,50,70};
        int n=arr.length;
        int pivot=n-1;
        int j=0;
        for (int i=0; j<pivot; j++)
        {
            if(arr[j]<=arr[pivot]) {
                int x=arr[i];
                arr[i]=arr[j];
                arr[j]=x;
                j++;
            }
            else {
                i++;
                j++;
            }
        }
        for (int x:arr) System.out.print(x+" ");
    }
}
