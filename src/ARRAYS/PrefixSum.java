package ARRAYS;
public class PrefixSum {
    public static void main(String[] args) {
        int [] arr ={5,3,2,4,1,8,6,10};
        int [] prefixSum= new int[arr.length];
        prefixSum[0]=arr[0];
        for (int i=1; i< arr.length; ++i)
        {
            prefixSum[i]=prefixSum[i]+prefixSum[i-1]+arr[i];
        }
        for (int x:prefixSum)
            System.out.print(x+" ");

    }
}