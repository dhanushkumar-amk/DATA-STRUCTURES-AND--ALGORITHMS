package SEARCHING;
public class SquareRoot {
    static int SquareRoot(int x) {
        int l=0;
        int r=x/2;
        int res=0;
        int mid=0;
        while (l<=r)
        {
             mid=(l+r)/2;
            if(mid*mid==x)
                return mid;
         else if(mid*mid>x)

             r=mid-1;
         else l=mid+1;
        }
        return mid;
    }
    public static void main(String[] args) {
        int x=23;
       int res= SquareRoot(x);
        System.out.println(res);
    }
}
