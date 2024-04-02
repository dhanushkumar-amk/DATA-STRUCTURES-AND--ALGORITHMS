package SEARCHING;
public class SmallestMissingPositive {
    static int missingNumber(int arr[], int size) {
        int n=size;

        for (int i=0; i<n; i++) {
            if (arr[i] > 0 || arr[i] <=n) {
                arr[arr[i]-1]=arr[]
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {0,-10,1,3,-20};
        int n = arr.length;
        int res = missingNumber(arr, n);
        System.out.println(res);
    }
}