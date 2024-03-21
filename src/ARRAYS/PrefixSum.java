package ARRAYS;
public class PrefixSum {
    public static void main(String[] args) {
        int [] arr ={10,20,10,5,15};
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