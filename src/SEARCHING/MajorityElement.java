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
                    continue;
                }
                else arr[i]=x;
            }else
            {
                i++;
            }
        }
        for (int x:arr)
            System.out.print(x+" ");
        for (int j=0; j<n; j++)
        {
            if(arr[j]>0)
                arr[j]+=arr[j];
            else arr[j]=0;
        }
        for (int xx:arr)
            System.out.print(xx+" ");
    }
}