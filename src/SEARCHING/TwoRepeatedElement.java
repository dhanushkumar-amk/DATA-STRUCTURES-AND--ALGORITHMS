package SEARCHING;

public class TwoRepeatedElement {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,3};
        int j=0;
        int res[]= new int [2];
        int freq[] = new int [n];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
            if(freq[arr[i]]==2){
                res[j]=arr[i];
                j++;
            }
        }
        for (int x:res) System.out.print(x+" ");
        }

}
