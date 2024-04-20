package SORTING;
public class MergeSortedArraysWithoutExtraSpace {
    static void insertionSort(int arr[],int n) {
        for (int i=1; i< n;i++)
        {
            if(arr[i-1]>arr[i])
            {
                int key=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key)
                    arr[j+1]=arr[j--];
               arr [j+1]=key;
            }
        }
    }
    static void print(int [] arr) {
        for (int x:arr) System.out.print(x+" ");
    }
    public static void main(String[] args) {
        int left[] = {1,4,8,12};
        int right[]={2,3,5,7,9};
        int lastPointer= left.length-1;
        int firstPointer= 0;
        while(left[lastPointer]>right[firstPointer]) {
            int temp=right[firstPointer];
            right[firstPointer]=left[lastPointer];
            left[lastPointer]=temp;
            lastPointer--;
            firstPointer++;
        }
        insertionSort(left, left.length);
        insertionSort(right, right.length);
        print(left);
        print(right);
    }
}