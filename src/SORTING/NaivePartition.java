package SORTING;

public class NaviPartition {
    public static void main(String[] args) {
        int [] arr ={3,8,6,12,10,7};

        int [] temp= new int[arr.length];
        int p=5;

        int k=0;

        for (int i=0; i< arr.length; i++)
            if(arr[i]<arr[p])
                temp[k++]=arr[i];

        temp[k]=arr[p];
        k+=1;

        for (int j=0; j< arr.length;j++)
            if(arr[j]>arr[p])
                temp[k++]=arr[j];
        
        for (int x:temp) System.out.print(x+" ");
    }

}
