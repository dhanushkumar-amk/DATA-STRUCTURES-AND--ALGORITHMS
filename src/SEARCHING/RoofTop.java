package SEARCHING;
public class RoofTop {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        int c=1;
        int res=0;
        for (int i=0;i< arr.length-1; i++)
        {
            if(arr[i+1]>arr[i])
                c++;
          res=  Math.max(c,res);
        }
        System.out.println(res);
    }
}