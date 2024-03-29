package SEARCHING;
public class MajorityElement {
    public static void main(String[] args) {
        int [] arr ={3,1,3,3,2};
        int n= arr.length;
        int i=0;
        while (i<n){
            if(arr[i]>0) {
                int x = arr[arr[i]-1];
                arr[arr[i]] -= 1;
                if(arr[i]==x) {
                    arr[i] = 0;
                }
                else arr[i]=x;
            }else
            {
                i++;
            }
        }
        for (int x:arr)
            System.out.print(x+" ");
    }
}