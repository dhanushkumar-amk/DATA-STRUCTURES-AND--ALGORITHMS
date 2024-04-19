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
            arr[j+1]=insertKey;
        }
    }
    public static void main(String[] args) {
        int [] arr ={4 ,1 ,3 ,9 ,7};
        insert(arr, arr.length);
        for (int x:arr) System.out.print(x+" ");
    }
}
