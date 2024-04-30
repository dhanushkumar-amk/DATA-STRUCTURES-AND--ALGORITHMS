package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 4, 3, 2, 1};

        int n = arr.length;
        partition(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static int partition(int arr[], int l, int h) {
        int i=l;
        int j=h;
        int pivot=arr[l];
        while(i<j)
        {
            i++;
            while(i<=h && arr[i]<pivot)
                i++;
            while(j>=l && arr[j]<pivot)
                j--;
            if(i<j && l<=h)
            {
                int x=arr[i];
                arr[i]=arr[j];
                arr[j]=x;
            }
        }
        return j;
    }
}