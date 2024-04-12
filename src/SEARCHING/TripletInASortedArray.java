package SEARCHING;
public class TripletInASortedArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,9,12};
        int n= arr.length;
        int i=0;

        int sum=25;
        for (;i<n-2;i++)
        {
            int s=sum-arr[i];
            int j=i+1;
            int k=j+1;
            while(j<k){
                if (k==n-1||arr[j]+arr[k]>s)
                {
                    j++;
                    k=j+1;
                }
                if (arr[j]+arr[k]==s)
                    System.out.println(i+" "+j+" "+k);
                else k++;
            }
        }
    }
}