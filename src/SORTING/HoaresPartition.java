package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int [] arr ={27,34,43,11,15,20,28,45,27,32};
        int n= arr.length;
        int left=0;
        int pivot=n-1;
        int right=pivot-1;
        while(left<right)
        {
            while(left<right && arr[left]<=arr[pivot])
                left++;
            while(left<right && arr[right]>=arr[pivot])
                right--;
            if(left<right)
            {
                int x=arr[left];
                arr[left]=arr[right];
                arr[right]=x;
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