package SORTING;

public class HoaresPartition {
    public static void main(String[] args) {
        int arr[] = new int[]{10,16,8,12,15,6,3,9,5};
        int n = arr.length;
       int j= partition(arr, 0, n - 1);
//        System.out.println(j);
        for (int temp : arr)
            System.out.print(temp + " ");
    }

    static int  partition(int arr[], int l, int h)
    {
        int left=l;
        int right=h;
        int pivot=arr[l];
        while(left<right)
        {
            do{
                left++;
            }
            while(arr[left]<pivot);
            do {
                right--;
            }while(arr[right]>pivot);
            if(left<right) {
                int x = arr[left];
                arr[left] = arr[right];
                arr[right] = x;
            }
        }
        System.out.println(left);
        System.out.println(right);
        return right;
    }
}