package SEARCHING;
public class SmallestMissingPositive {
    static int missingNumber(int arr[], int size) {
        int n=size;

        for (int i=0; i<n; i++) {
            if (arr[i] > 0 && arr[i] <=n) {
                int x=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[arr[i]-1]=x;
            }
        }
        for (int x:arr)
            System.out.print(x+" ");
        return 1;

    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,-3,8,2};
        int n = arr.length;
        int res = missingNumber(arr, n);
        System.out.println(res);
    }
}