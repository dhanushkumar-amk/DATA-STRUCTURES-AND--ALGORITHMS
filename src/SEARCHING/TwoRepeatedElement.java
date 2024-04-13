package SEARCHING;

public class TwoRepeatedElement {
    public static void main(String[] args) {
        int arr[] ={};
        int n=arr.length;
        int i=0;
        for( i<n;)
        {
            while(arr[i]>0 && arr[i]<=n ){
                int temp=arr[arr[i]-1];
                if(arr[arr[i]-1]<0){
                    arr[arr[i]-1]-=1;
                }
                else arr[arr[i]-1]=-1;
            }
            i++;
        }
    }
}
