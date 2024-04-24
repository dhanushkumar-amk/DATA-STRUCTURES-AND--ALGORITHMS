package SORTING;

public class FindTripletsWithZeroSum {
    public static void main(String[] args) {
        int [] arr ={1, 2, 3};
        int n= arr.length;
        int i=0;
        int j=i+1;
        int k=n-1;
        int sum=0;
        while(j<k &&  i<k-1)
        {
            if(arr[i]+arr[j]+arr[k]==0)
            {
                System.out.println(1);
                break;
            }
            else j++;

            if(j>=k)
            {
                i++;
                j=i+1;
                k--;
            }
        }
    }
}
