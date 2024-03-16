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
            System.out.print(x+" ");
        for (int j=0; j<n; j++)
        {
            if(arr[j]>n/2)
                return j+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3};
       int res= MajorityElement(arr, arr.length);

        System.out.println(res);
    }
}
