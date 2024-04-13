package SEARCHING;

public class TwoRepeatedElement {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        int j=0;
        int res[]= new int [2];
        int freq[] = new int [arr.length];
        for(int i=0;i< arr.length;i++)
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
