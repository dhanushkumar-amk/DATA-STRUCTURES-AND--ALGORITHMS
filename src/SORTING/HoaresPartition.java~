package SORTING;

public class HoaresPartition {
    static void hores(int [] arr,int n) {
        int left = -1;
        int right = n + 1;
        int ind = 2;
        int pivot = arr[ind];
        while (true) {
            do {
                left++;
            } while (arr[left] < pivot);
            do {
                right--;
            } while (arr[right] > pivot);
            if (left >= right) return;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
        public static void main(String[] args) {
            int [] arr ={};
            int n= arr.length;
            hores(arr,n-1);
            for (int t:arr) System.out.print(t+" ");
            System.out.println();

    }
    }