package ARRAYS;
public class LongestEvenOddSubArray {
    static void LongestEvenOddSubarray (int [] arr){
        int n= arr.length;
        int count=0;
        int sum=0;
        if(arr.length>1){
        for(int i=1; i<n; i++)
        {
            if (arr[i]%2!=arr[i-1]%2) {
                sum++;
            }
            else {
                if (sum>count)
                {
                    count=sum;
                    sum=0;
                }

            }
        }
        }
        else System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        int [] arr = {10,12,14,7,8};
        LongestEvenOddSubarray(arr);
    }
}
