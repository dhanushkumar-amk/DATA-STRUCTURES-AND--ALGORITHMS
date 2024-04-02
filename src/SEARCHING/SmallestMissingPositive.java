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
        }
        for (int x:arr) System.out.print(x+" ");
        System.out.println();
        for (int i=0; i<n;i++)
        {
            if (arr[i]!=i+1)
                return i+1;
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = {0 ,1 ,2 ,3, 4 ,5 ,6 ,7 ,8, 9 ,10, 11, 12};
        int n = arr.length;
        int res = missingNumber(arr, n);
        System.out.println(res);
    }
}