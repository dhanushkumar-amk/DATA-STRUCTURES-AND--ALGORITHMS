package SORTING;

public class HoaresPartition {
    static void hores(int [] arr,int n) {
        int i=0;
        int j=n-1;
        int ind=0;
        int pivot=arr[ind];
        while(i<j)
        {
            i++;
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<=j)
            {
                int x=arr[i];
                arr[i]=arr[j];
                arr[j]=x;
            }
        }
//        System.out.println(i);
//        System.out.println(j);
        int x=arr[j];
        arr[j]=arr[ind];
        arr[ind]=x;
    }
    public static void main(String[] args) {
        int [] arr ={5,3,8,4,2,7,1,10};
        int n= arr.length;
         hores(arr,n);
        for (int t:arr) System.out.print(t+" ");
        System.out.println();
    }
}