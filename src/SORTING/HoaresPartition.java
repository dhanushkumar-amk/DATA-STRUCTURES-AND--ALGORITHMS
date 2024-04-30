package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{9,7,5,14,2,3,6,10};

        int n = arr.length;
      int ind[] =  partition(arr, 0, n - 1);
      int temp=arr[ind[0]+1];
      arr[ind[0]+1]=arr[ind[1]];
      arr[ind[1]]=temp;
        for (int x : arr)
            System.out.print(x + " ");

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