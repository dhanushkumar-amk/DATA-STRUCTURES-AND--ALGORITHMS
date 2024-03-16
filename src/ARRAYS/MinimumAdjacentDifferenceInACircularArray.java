package ARRAYS;
public class MinimumAdjacentDifferenceInACircularArray {
    public static void main(String[] args) {
        int [] arr ={}
        int curr=0;
        int min=Integer.MAX_VALUE;
        int temp=0;
        for(int i=1;i<n; i++)
        {
            temp=Math.abs(arr[i]-arr[i-1]);
            if(temp<min)
                min=temp;
        }
        if(arr[n-1]-arr[0]<min)
            min=arr[n-1]-arr[0];
        return min;
    }
}
