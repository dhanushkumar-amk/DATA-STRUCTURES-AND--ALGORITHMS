package SORTING;

public class NaivePartition {
    public static void main(String[] args) {
        int [] arr ={5,13,6,9,12,11,8};

        int [] temp= new int[arr.length];
        int p= arr.length-1;

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
