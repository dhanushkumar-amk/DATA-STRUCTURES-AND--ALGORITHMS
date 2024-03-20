package ARRAYS;
public class LongestSubArrayOfEvensAndOdds {
    static int LongestSubArrayEvenAndOdd(int [] arr,int n) {
        int sum=0;
        int maxLen=1;
        for(int i=1; i<n; i++)
        {
            if(arr[i]%2!=arr[i-1]%2) {
                sum++;
                maxLen = Math.max(sum,maxLen);
            }

        }
        System.out.println(sum);
        return -1;
    }
    public static void main(String[] args) {
        int [] arr ={10,12,14,7,8};
        int n= arr.length;
        LongestSubArrayEvenAndOdd(arr,n);
    }
}
