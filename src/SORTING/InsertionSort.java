package SORTING;

public class InsertionSort {
    static void shift(int [] arr,int n,int end,int start) {
        for (int k=end;k>start; start--)
        {
            arr[start]=arr[start-1];
        }
    }
    static void insert(int []arr,int n) {
        for (int i=1; i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                int min=arr[i-1];
                int temp=arr[i];
                for (int j=i;j>=0 ;j--)
                {
                    if(arr[i]<arr[j])
                        min=j;
                }
                shift(arr,n,i,min);
                arr[min]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        insert(arr, arr.length);
        for (int x:arr) System.out.print(x+" ");
    }
}