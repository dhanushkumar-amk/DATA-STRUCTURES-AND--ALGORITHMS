package ARRAYS;
public class MajorityElement {
    static int MajorityElement (int [] arr ,int n) {
        int i=0;
        while(i<n)
        {
            if(arr[i]<=0 || arr[i]>n)
            {
                i++;
                continue;
            }
            int ind=arr[i]-1;
            if(arr[ind]>0) {
                arr[i] = arr[ind];
                arr[i] = -1;
            }
            else{
            arr[ind]--;
            arr[i] = 0;
            i++;
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
