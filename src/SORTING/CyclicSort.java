package SORTING;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        int i=0;
        int n= arr.length;
        while(i<n) {
            if(arr[i]!=i+1)
            {
                int x=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[arr[i]-1]=x;
            }
            else i++;
        }
    }
}
