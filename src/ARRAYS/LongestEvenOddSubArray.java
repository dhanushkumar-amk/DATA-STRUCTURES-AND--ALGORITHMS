package ARRAYS;
public class LongestEvenOddSubArray {
    static void LongestEvenOddSubarray (int [] arr){
        int n= arr.length;
        int count=0;
        int sum=0;
        if(arr.length>1){
        for(int i=1; i<n; i++)
        {
            if (sum>count)
            {
                count=sum;
                sum=0;
            }
            if (arr[i]%2!=arr[i-1]%2) {
                sum++;
            }
        }
            System.out.println(count);
        }
        else System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5,7,9};
        LongestEvenOddSubarray(arr);
    }
}
