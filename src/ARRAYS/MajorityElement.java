package ARRAYS;
public class MajorityElement {
    static int MajorityElement (int [] arr ,int n) {

        for(int i=0; i<n; i++)
        {
          if(arr[i]>0 &&(arr[i]<n))
              arr[arr[i]]+=-1;
        }
        for (int temp:arr)
            System.out.print(temp+" ");
        return 10;
    }
    public static void main(String[] args) {
        int []arr = {5,4,13,5,5,4,5};
       int res= MajorityElement(arr, arr.length);
        System.out.println(res);
    }
}
