package SEARCHING;
public class SmallestMissingPositive {
    static int missingNumber(int arr[], int size) {
        int n=size;

        for (int i=0; i<n;i++) {
            if (arr[i] > 0 && arr[i] <=n) {
                int x=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=x;
            }
            if(arr[i]!=i+1)
                return i+1;
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,-3,8,2};
        int n = arr.length;
        int res = missingNumber(arr, n);
        System.out.println(res);
    }
}