package SEARCHING;
public class SquareRoot {
    static int SquareRoot(int x) {
        int l=0;
        int r=x/2;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if(mid*mid==x)
             return mid;
         else if(mid*mid>x)
             r=mid-1;
         else l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int x=25;
       int res= SquareRoot(x);
        System.out.println(res);
    }
}
