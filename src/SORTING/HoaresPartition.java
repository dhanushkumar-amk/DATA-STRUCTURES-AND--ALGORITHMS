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
            if(arr[left]>arr[pivot])
            {
                int x=arr[left];
                arr[left]=arr[right];
                arr[right]=x;
                left++;
            }
            else right++;
        }
        int temp=arr[left];
        arr[left]=arr[pivot];
        arr[pivot]=temp;
        for (int x:arr) System.out.print(x+" ");
    }
}
