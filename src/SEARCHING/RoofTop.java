package SEARCHING;
public class RoofTop {
    public static void main(String[] args) {
        int [] arr ={1,2,2};
        int c=-1;
        int res=Integer.MIN_VALUE;
        for (int i=0;i< arr.length-1; i++)
        {
            if(arr[i+1]>arr[i])
                c++;
          res=  Math.max(c,res);
        }
        System.out.println(res);
    }
}
