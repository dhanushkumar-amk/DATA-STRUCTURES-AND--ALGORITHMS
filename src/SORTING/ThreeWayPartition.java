package SORTING;

public class ThreeWayPartition {
    static void partition(int[] arr,int a,int b) {
        int start=0;
        int n= arr.length;
        int end=n-1;
        int mid=0;
        while(start<=end)
        {
            if(arr[mid]<a){
                    int temp=arr[mid];
                    arr[mid]=arr[start];
                    arr[start]=temp;
                    mid++;
                    start++;
                }
            else if(arr[mid]>b){
                int temp=arr[mid];
                arr[mid]=arr[end];
                arr[end]=temp;
//                mid++;
                end--;
            }
            else mid++;
        }
    }
    public static void main(String[] args) {
        int [] arr ={10 ,7, 6 ,1 ,4, 10 ,5 ,2 ,7, 5, 3, 3, 8, 3 ,8};
        int a=5;
        int b=5;
        partition(arr,a,b);
        for (int x:arr) System.out.print(x+" ");
    }
}
