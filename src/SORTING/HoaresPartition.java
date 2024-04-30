package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{9,7,5,14,2,3,6,10};
        int n = arr.length;
        int[] indices = partition(arr, 0, n - 1);
        int x=arr[indices[0]+1];
        arr[indices[1]+1]=arr[indices[0]+1];
        arr[indices[0]+1]=x;
        for (int temp : arr)
            System.out.print(temp + " ");
    }

    static int[] partition(int arr[], int l, int h)
    {
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)return new int[]{i,j};
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}