package SEARCHING;
public class RoofTop {
    public static void main(String[] args) {
        int [] arr ={1,2,2,3,4,5,7,8,6,5};
        int c=1;
        int res=0;
        for (int i=0;i< arr.length-1; i++)
        {
          if(arr[i+1]-arr[i]>0)
              c++;
          else res=Math.max(res,c);
        }
        System.out.println(res);
    }
}
