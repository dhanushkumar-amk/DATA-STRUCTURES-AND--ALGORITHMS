package SEARCHING;
public class RoofTop {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        int c=0;
        int res=0;
        for (int i=0;i< arr.length-1; i++)
        {
            if(arr[i]<arr[i+1]) {
                c++;
               res= Math.max(c,res);
            }
          if(arr[i]>arr[i+1]) {
              res = Math.max(c, res);
              c=0;
          }
        }
        System.out.println(res);
    }
}
