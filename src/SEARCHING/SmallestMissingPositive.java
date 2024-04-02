package SEARCHING;
public class SmallestMissingPositive {
    static int missingNumber(int arr[], int size) {
        int n=size;

        for (int i=0; i<n;i++) {
                int ele=arr[i];
                int pos=ele-1;
            if (arr[i] >=1 && arr[i] <=n) {
                if (ele != pos) {
                    int x = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = x;
                    i--;
                }
            }
        }
        for (int i=0; i<n;i++)
            if (arr[i]!=i+1)
                return i+1;
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int n = arr.length;
        int res = missingNumber(arr, n);
        System.out.println(res);
    }
}