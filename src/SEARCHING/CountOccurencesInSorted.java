package SEARCHING;

public class CountOccurencesInSorted {
    static int CountOccurSorted(int [] arr,int n,int x) {
        int l=0;
        int r=n-1;
        int pos=-1;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>=x)
            {
                pos=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return pos;
    }
    public static void main(String[] args) {
        int [] arr ={10,20,20,20,30,30};
        int x=20;
        int n= arr.length;
        int res=CountOccurSorted(arr,n,x);
        int count=0;
        if(res==-1)
            System.out.println("0");
        for (int i=res; i<n; i++)
        {
            if(arr[i]==x)
                count++;
            else break;
        }
        System.out.println(count);
    }
}
