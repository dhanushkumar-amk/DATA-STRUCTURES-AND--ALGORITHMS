package SEARCHING;
public class TripletInASortedArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,9,12};
        int n= arr.length;
        int sum=25;
        for (int i=0; i<n-2; i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if (arr[i]+arr[j]+arr[k]==sum)
                    System.out.println(i+" "+j+" "+k);
                else if(arr[i]+arr[j]+arr[k]<sum)
                    j++;
                else k--;
            }
        }

    }
}