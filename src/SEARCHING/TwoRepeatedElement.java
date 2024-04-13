package SEARCHING;

public class TwoRepeatedElement {
    public static void main(String[] args) {
        int arr[] = {5 ,4, 7, 2 ,8 ,1, 3, 9 ,6 ,4, 3};
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
