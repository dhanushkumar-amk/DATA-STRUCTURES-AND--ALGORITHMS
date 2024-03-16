package ARRAYS;
public class MinimumAdjacentDifferenceInACircularArray {
    public static void main(String[] args) {
        int [] arr ={10,-3,-4,7,6,5,-4,-1};
        int n= arr.length;
        int curr=0;
        int min=Integer.MAX_VALUE;
        int tempOne=0;
        int tempTwo=0;
        for(int i=1;i<n; i++)
        {
            tempOne=Math.abs(arr[i]-arr[i-1]);
            tempTwo=Math.abs(arr[0]-arr[i-1]);
            if(tempOne<min)
                min=tempOne;
            else min=tempTwo;
        }
        if(arr[n-1]-arr[0]<min)
            min=arr[n-1]-arr[0];
        if(arr[n-1]-arr[0]<min)
            min=arr[0]-arr[n-1];

        System.out.println(min);
    }
}
