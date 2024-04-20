package SORTING;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MergeSort {

   static void merge(int [] arr,int low,int mid,int high) {
       ArrayList<Integer> arrayList = new ArrayList<>();
       int k=0;
       int left=low;
       int right=mid+1;
       while(left<=mid &&right<=high)
       {
           if(arr[left]<=arr[right])
               arrayList.add(arr[left++]);

           else arrayList.add(arr[right++]);
       }
       while(left<=mid)
           arrayList.add(arr[left++] );

       while(right<=high)
           arrayList.add(arr[right++]);

       for (int i=low;i<=high;i++)
           arr[i]= arrayList.get(i-low);
   }
   static int count=0;
    static void mergeSort(int [] arr,int l,int r) {
        if(l<r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            count++;
            mergeSort(arr, mid + 1, r);
            count++;
            merge(arr,l,mid,r);
            count++;
        }
    }
    public static void main(String[] args) {
        // Define the size of the array
        int size = 100; // 100 million

        // Create the array
        int[] largeArray = new int[size];

        // Fill the array with unique values
        for (int i = 0; i < size; i++) {
            largeArray[i] = i;
        }

        // Shuffle the array to randomize the order
        shuffleArray(largeArray);

        // Display a message indicating successful creation
        System.out.println("Array of size " + size + " with unique numbers created successfully.");
        mergeSort(largeArray,0, largeArray.length-1);
        for (int x:largeArray) System.out.println(x+" ");
        System.out.println("Total recursive call"+ count);
    }
    private static void shuffleArray(int[] array) {
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            // Swap elements
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
