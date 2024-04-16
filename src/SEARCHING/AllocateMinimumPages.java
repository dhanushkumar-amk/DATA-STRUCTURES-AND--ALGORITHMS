package SEARCHING;

public class AllocateMinimumPages {
    static int binarySearch(int [] arr,int n) {
        int left=0;
        int right=n-1;
        int Min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int MaxSum=0;
        while(left<right) {
            if (arr[left]  < Min) Min = arr[left];
            MaxSum+=arr[left]+arr[right];
            left++;
            right--;
        }
//        int l=;
//        int r=;
//        while()
        System.out.println(Min);
        System.out.println(MaxSum);
        return -1;
    }
    static int isPossible(int[] arr,int n) {
        return -1;
    }

    public static void main(String[] args) {
        int [] arr ={12,34,67,90};
        int res=binarySearch(arr, arr.length);
        System.out.println(res);
    }
}
