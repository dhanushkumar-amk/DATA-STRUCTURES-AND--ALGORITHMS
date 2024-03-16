package ARRAYS;
public class MinimumAdjacentDifferenceInACircularArray {
    public static void main(String[] args) {
        int [] arr ={10,-3,-4,7,6,5,-4,-1};
        int n= arr.length;
        int curr=0;
        int min=Integer.MAX_VALUE;
        for (int i=1; i<n; i++)
        {
            if ((arr[i]-arr[i-1])<min)
                min=(arr[i]-arr[i-1]);
            else
                min=(arr[i-1]-arr[i]);
        }
        if((arr[n-1]-arr[0])<min)
            min=(arr[n-1]-arr[0]);
        min=Math.abs(min);
        System.out.println(min);
    }
}
