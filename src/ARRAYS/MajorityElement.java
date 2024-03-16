package ARRAYS;
public class MajorityElement {
    static int MajorityElement (int [] arr ,int n) {
        int i=0;
        int N=n;
        while(i<N)
        {
            if(arr[i]<=0||arr[i]>N)
            {
                i++;
                continue;
            }
            int  ind=arr[i]-1;
            if(arr[ind]>0)
            {
                arr[i]=arr[ind];
                arr[ind]=-1;
            }
            else {
                arr[ind]--;
                arr[i]=0;
                i++;
            }

        }
        for(int j=0;j<N; j++){
            if(arr[j]<0)
                arr[j]=-arr[j];
            else arr[j]=0;

        }
        for (int x:arr)
            if(x>n/2)
                return x;
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {5,4,13,5,5,4,5};
       int res= MajorityElement(arr, arr.length);

        System.out.println(res);
    }
}
