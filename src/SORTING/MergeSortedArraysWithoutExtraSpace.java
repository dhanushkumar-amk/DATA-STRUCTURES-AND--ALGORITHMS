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
        int arr1[] = {12,42};
        int arr2[]={3,4,5,28,37,42,43,46};
        int lastPointer= arr1.length-1;
        int firstPointer= 0;
        while(arr1[lastPointer]>arr2[firstPointer] ) {
            int temp=arr2[firstPointer];
            arr2[firstPointer]=arr1[lastPointer];
            arr1[lastPointer]=temp;
            lastPointer--;
            firstPointer++;
        }
        insertionSort(arr1, arr1.length);
        insertionSort(arr2, arr2.length);
        print(arr1);
        print(arr2);
    }
}