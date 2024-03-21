package ARRAYS;
public class PrefixSum {
    static int []prefixSumAdding() {
        int [] arr ={5,3,2,4,1,8,6,10};
        int [] prefixSum= new int[arr.length];
        prefixSum[0]=arr[0];
        for (int i=1; i< arr.length; ++i)
        {
            prefixSum[i]=prefixSum[i]+prefixSum[i-1]+arr[i];
        }
        return  prefixSum;
    }
    static int 
    public static void main(String[] args) {

    }
}