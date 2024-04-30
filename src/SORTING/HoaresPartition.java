package SORTING;

public class HoaresPartition {
    static void hores(int [] arr,int n) {
        int pivot = arr[0];
        int i = 0 - 1, j = n + 1;

        while (true)
        {
            // Find leftmost element greater
            // than or equal to pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // Find rightmost element smaller
            // than or equal to pivot
            do {
                j--;
            } while (arr[j] > pivot);

            // If two pointers met.
            if (i >= j)
                return ;

            // swap(arr[i], arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
    public static void main(String[] args) {
        int [] arr ={10, 17, 18, 9, 11, 15};
        int n= arr.length-1;
     hores(arr,n);

        for (int t:arr) System.out.print(t+" ");
        System.out.println();
    }
}