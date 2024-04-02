package SEARCHING;
public class SmallestMissingPositive {
    static int missingNumber(int arr[], int size) {
        int MissingNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                MissingNumber = 1;
                break;
            }
        }
        if(MissingNumber==0)
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11, 12};
        int n = arr.length;
        int res = missingNumber(arr, n);
        System.out.println(res);
    }
}