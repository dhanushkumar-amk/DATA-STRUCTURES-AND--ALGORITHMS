package SORTING;

public class LomutoPartition {
    public static void main(String[] args) {
        int [] arr= new int[] {12,9,7,15,10};
        int n=arr.length;
        int pivot=arr[n-1];
        int j=0;
        int i=0;
        for (;j<=n-1; j++)
        {
            if(arr[j]<=pivot)
            {
                int x=arr[i];
                arr[i]=arr[j];
                arr[j]=x;
                i++;
            }
            else j++;
        }
        for (int xx:arr) System.out.print(xx+" ");
    }
}
