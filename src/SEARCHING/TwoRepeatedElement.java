package SEARCHING;

public class TwoRepeatedElement {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i]<=0|| arr[i]>n)
            {
                i++;
                continue;
            }

            if(arr[arr[i]-1]>0)
            {
                arr[i]=arr[arr[i]-1];
                arr[arr[i]-1]=-1;
            }
            else {
                arr[arr[i]-1]--;
                arr[i]=0;
                i++;
            }
        }
        for (int j=0;j<n; j++)
        {
            if(Math.abs(arr[j])==2)
                System.out.print((j+1)+" ");
        }
    }
}
