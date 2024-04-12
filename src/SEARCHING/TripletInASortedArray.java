package SEARCHING;
public class TripletInASortedArray {
    public static void main(String[] args) {
        int [] arr = {1 ,4 ,45, 6 ,10, 8};
        int n= arr.length;
        int sum=13;
        for (int i=0; i<n-2; i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if (arr[i]+arr[j]+arr[k]==sum) {
                    System.out.println(i + " " + j + " " + k);
                    break;
                }
                else if(arr[i]+arr[j]+arr[k]<sum)
                    j++;
                else k--;
            }
        }

    }
}