package ARRAYS;
public class MajorityElement {
    static int MajorityElement (int [] arr ,int n) {
        int i=0;
        while(i<n)
        {
            if(arr[i]<n)
            {
                i++;
                continue;
            }
            if(arr[i]>n||arr[arr[i]]>n)
            {
                i++;
                continue;
            }
            if(arr[i]<n && arr[i]>0)
            {
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]-=1;
                arr[i]=temp;
            }
        }
        for (int temp:arr)
            System.out.print(temp+" ");

        return 10;
    }
    public static void main(String[] args) {
        int []arr = {5,4,13,5,5,4,5};
       int res= MajorityElement(arr, arr.length);

    }
}
