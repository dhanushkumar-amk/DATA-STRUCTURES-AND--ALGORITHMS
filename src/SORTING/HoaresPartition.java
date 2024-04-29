package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int [] arr ={36,34,43,11,15,20,28,45,27,32};
        int n= arr.length;
        int left=0;
        int pivot=n-1;
        int right=pivot-1;
        while(left<=right)
        {
            if(!(arr[left]<=arr[right]&& arr[left]<=arr[pivot]))
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
            if((arr[right]>=arr[pivot]&&arr[right]>=arr[left]))
            {
                int temp=arr[right];
                arr[right]=arr[left];
                arr[right]=temp;
                right--;
            }
        }
        if(arr[left]>arr[pivot])
        {
            int t=arr[left];
            arr[left]=arr[pivot];
            arr[pivot]=t;
        }
        for (int x:arr) System.out.print(x+" ");
    }
}