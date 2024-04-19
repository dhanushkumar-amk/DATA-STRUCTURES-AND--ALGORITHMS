package SORTING;

public class InsertionSort {

    static void insert(int []arr,int n) {
        for (int i=1; i<n;i++)
        {
            int insertKey=arr[i];
            int j=i-1;
            while(j>=0 && insertKey>arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j]=insertKey;
        }
    }
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        insert(arr, arr.length);
        for (int x:arr) System.out.print(x+" ");
    }
}
