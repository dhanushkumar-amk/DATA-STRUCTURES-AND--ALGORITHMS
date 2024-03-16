package ARRAYS;
public class MinimumAdjacentDifferenceInACircularArray {
    public static void main(String[] args) {
        int [] arr ={10,-3,-4,7,6,5,-4,-1};
        int n= arr.length;
        int curr=0;
        int min=Integer.MAX_VALUE;
        for (int i=1; i<n; i++)
        {
            int x=Math.abs(arr[i]-arr[i-1]);
            if(x<min)
                min=x;
        }
        if (Math.abs(arr[n-1]-arr[0])<min)
            min=Math.abs(arr[n-1]-arr[0]);
        System.out.println(min);
    }
}
