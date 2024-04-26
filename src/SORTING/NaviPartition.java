package SORTING;

public class NaviPartition {
    public static void main(String[] args) {
        int [] arr ={10,9,8,7,6,5,4,3,2,1};
        int p=5;
        int [] temp = new int [arr.length];
        for (int x:arr) System.out.print(x+" ");
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]==arr[p]) {
                arr[i] = arr[p];
                break;
            }
            if(arr[i]<arr[p])
                temp[i]=arr[i];
        }
        for (int j=0; j<arr.length; j++)
        {
            System.out.print(j+" ");
        }
        for (int x:temp) System.out.print(x+" ");
    }
}
