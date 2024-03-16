package ARRAYS;
public class MinimumAdjacentDifferenceInACircularArray {
    public static void main(String[] args) {
        int [] arr ={10,-3,-4,7,6,5,-4,-1};
        int n= arr.length;
        int curr=0;
        int min=Integer.MAX_VALUE;
        for (int i=1; i<n; i++)
        {
            if (Math.abs(arr[i]-arr[i-1])<min)
                min=Math.abs(arr[i]-arr[i-1]);
            else
                min=Math.abs(arr[i-1]-arr[i]);
        }
        if(Math.abs(arr[0]-arr[n-1])<min)
            min=Math.abs(arr[i]-arr[]);
        System.out.println(min);
    }
}
